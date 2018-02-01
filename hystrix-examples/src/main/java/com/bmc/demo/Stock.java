package com.bmc.demo;

/**
 * 仓库
 * @author Administrator
 *
 */
public class Stock {
 
	private String addr;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Stock [addr=" + addr + "]";
	}
}
