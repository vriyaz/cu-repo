package com.cu.dp.creational.singleton;
import com.cu.utils.Logger;

public class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {};
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		Logger.log("Hello World from the SingleObject");
	}
}
