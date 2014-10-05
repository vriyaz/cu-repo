package com.cu.dp.structural.decorator;
import com.cu.utils.Logger;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator (Shape decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		Logger.log("Border color: Red");
	}
}
