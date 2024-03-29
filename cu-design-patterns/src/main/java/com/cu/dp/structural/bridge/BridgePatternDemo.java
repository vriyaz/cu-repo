package com.cu.dp.structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(50, 50, 5, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
