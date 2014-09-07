package com.cu.dp.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
	
	Color getColor(String color) {
		return null;
	}
}
