package com.bmc.demo;

public class StockService {
  
	public Stock getStockByOrder(int orderId){
		 Stock stock= new Stock();
		 stock.setAddr("我的地址");
		 return stock;
	}
}
