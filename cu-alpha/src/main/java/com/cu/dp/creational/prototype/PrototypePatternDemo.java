package com.cu.dp.creational.prototype;
import com.cu.utils.Logger;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		Logger.log("Shape: " + clonedShape1.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		Logger.log("Shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		Logger.log("Shape: " + clonedShape3.getType());
	}

}
