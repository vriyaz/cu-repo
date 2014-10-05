package com.cu.dp.structural.proxy;
import com.cu.utils.Logger;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		load(this.fileName);
	}

	public void display() {
		Logger.log("displaying ... " + fileName);

	}
	private void load(String fileName) {
		Logger.log("loading ... " + fileName);
	}

}
