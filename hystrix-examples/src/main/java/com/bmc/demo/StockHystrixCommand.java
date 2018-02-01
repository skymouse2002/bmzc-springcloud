package com.bmc.demo;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixCommandProperties.ExecutionIsolationStrategy;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixCommand.Setter;

public class StockHystrixCommand extends HystrixCommand<StockService> {

	private int count;
	protected StockHystrixCommand(int count) {
//		HystrixCommandProperties.Setter t= HystrixCommandProperties.Setter();
//    	t.withCircuitBreakerEnabled(false);
//    	t.withCircuitBreakerErrorThresholdPercentage(1);
//    	t.withExecutionTimeoutInMilliseconds(100);
		
    	super(Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey("SystemX"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("SecondaryCommand"))
                .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("SecondaryCommand"))
                .andCommandPropertiesDefaults(
                        // we default to a 100ms timeout for secondary
                        HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(100)
                        .withCircuitBreakerEnabled(false).withCircuitBreakerErrorThresholdPercentage(1).withExecutionIsolationStrategy(ExecutionIsolationStrategy.THREAD)));
    	this.count=count;
    	//设置配置

	}

	@Override
	protected StockService run() throws Exception {
		if(count>200) {
			throw new Exception();
		}
		return new StockService();
	}

}
