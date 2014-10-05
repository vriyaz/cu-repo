package com.cu.dp.creational.prototype;
import com.cu.utils.Logger;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	@Override
	void draw() {
		Logger.log("inside Circle::draw()");
	}

}
