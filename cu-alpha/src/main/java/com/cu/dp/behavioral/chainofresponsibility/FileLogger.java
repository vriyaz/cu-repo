package com.cu.dp.behavioral.chainofresponsibility;
import com.cu.utils.Logger;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}
	
	protected void write(String message) {
		Logger.log("File::Logger: " + message);
	}

}
