package com.cu.dp.structural.proxy;
import com.cu.utils.Logger;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("text.jpg");
		
		// image will be loaded from disk
		image.display();
		Logger.log("");
		// image will not be loaded from disk
		image.display();
	}
}
