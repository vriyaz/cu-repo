package com.cu.dp.creational.prototype;
import com.cu.utils.Logger;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}
	@Override
	void draw() {
		Logger.log("inside Rectangle::draw()");
	}

}
