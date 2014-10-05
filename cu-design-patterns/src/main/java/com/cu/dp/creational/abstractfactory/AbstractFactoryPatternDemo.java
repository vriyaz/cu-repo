package com.cu.dp.creational.abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	}
}
