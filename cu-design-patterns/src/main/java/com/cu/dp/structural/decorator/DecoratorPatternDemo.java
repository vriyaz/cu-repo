package com.cu.dp.structural.decorator;
import com.cu.utils.Logger;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		Logger.log("circle with normal border");
		circle.draw();
		
		Logger.log("circle with red border");
		redCircle.draw();
		
		Logger.log("rectangle with red border");
		redRectangle.draw();
	}
}
