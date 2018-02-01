package com.bmc.demo;

import java.util.List;

public class OrderService {

	private List<JdOrder> orderList;
	private volatile int count=0;
	
	public JdOrder getOrder(int orderId) {
		JdOrder order= new JdOrder();
		order.setName("我的订单");
		while(true) {
			
			StockService stockService=new StockHystrixCommand(count).execute();
			Stock stock=stockService.getStockByOrder(1);
			order.setStock(stock);
			System.out.println("end***"+count);
			count++;
		}
//		StockService stockService=new StockService();
//		StockService stockService=new StockHystrixCommand().execute();
//		Stock stock=stockService.getStockByOrder(1);
//		order.setStock(stock);
//		return order;
	}
	public JdOrder getOrderbyId(int orderId) {
		return orderList.get(0);
	}
	public static void main(String[] args) {
		OrderService OrderService=new OrderService();
		JdOrder order =OrderService.getOrder(1);
		System.out.println(order.toString());
	}
}
