package com.cu.dp.creational.builder;

public abstract class Soda implements Item {

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
}
