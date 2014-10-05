package com.cu.dp.behavioral.chainofresponsibility;
import com.cu.utils.Logger;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	protected void write(String message) {
		Logger.log("Console::logger: " + message);
	}

}
