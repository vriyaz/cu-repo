package com.cu.dp.behavioral.chainofresponsibility;

import com.cu.utils.Logger;

public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {

		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "Information");
		Logger.separator();
		loggerChain.logMessage(AbstractLogger.DEBUG, "Debug");
		Logger.separator();
		loggerChain.logMessage(AbstractLogger.ERROR, "Error");
		Logger.separator();
		
	}

}
