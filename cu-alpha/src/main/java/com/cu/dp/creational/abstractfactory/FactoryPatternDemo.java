package com.cu.dp.creational.abstractfactory;

public class FactoryPatternDemo {

	public static void main (String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
	}
}
