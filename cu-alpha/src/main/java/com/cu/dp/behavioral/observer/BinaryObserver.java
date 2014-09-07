package com.cu.dp.behavioral.observer;
import com.cu.utils.Logger;

public class BinaryObserver extends Observer {
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		Logger.log("Binary string: " + Integer.toBinaryString(subject.getState()));
	}

}
