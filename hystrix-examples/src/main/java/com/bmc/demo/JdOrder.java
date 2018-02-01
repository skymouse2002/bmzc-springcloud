package com.bmc.demo;

public class JdOrder {

	private String name=null;

	private Stock stock;
	@Override
	public String toString() {
		return "JdOrder [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}


}
