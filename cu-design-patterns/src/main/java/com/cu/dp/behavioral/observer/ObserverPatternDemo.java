package com.cu.dp.behavioral.observer;
import com.cu.utils.Logger;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		Logger.log("First state change: 15");
		subject.setState(15);
		Logger.log("Second state change: 20");
		subject.setState(20);
	}
}
