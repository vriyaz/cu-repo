package com.cu.dp.creational.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
