package com.cu.dp.behavioral.command;
import com.cu.utils.Logger;

public class Stock {

	private String name = "ABC";
	private int quantity = 10;
	
	public void buy() {
		Logger.log("Stock: " + name + ", Quantity: " + quantity + " bought");
	}
	public void sell() {
		Logger.log("Stock: " + name + ", Quantity: " + quantity + " sold");
	}
}
