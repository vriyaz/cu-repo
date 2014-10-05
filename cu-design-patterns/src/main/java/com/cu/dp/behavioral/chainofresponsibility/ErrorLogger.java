package com.cu.dp.behavioral.chainofresponsibility;
import com.cu.utils.Logger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	protected void write(String message) {
		Logger.log("Error::Logger: " + message);
	}

}
