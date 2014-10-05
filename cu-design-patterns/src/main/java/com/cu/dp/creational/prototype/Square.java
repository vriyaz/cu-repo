package com.cu.dp.creational.prototype;
import com.cu.utils.Logger;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}
	@Override
	void draw() {
		Logger.log("inside Square::draw()");
	}

}
