package com.cu.dp.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice == null) {
			return null;
		}
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
