package com.cu.dp.creational.builder;
import java.util.ArrayList;
import java.util.List;

import com.cu.utils.Logger;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			Logger.log("Item: " + item.name() + ", packing: " + item.packing().pack() + ", price: " + item.price());
		}
	}
}
