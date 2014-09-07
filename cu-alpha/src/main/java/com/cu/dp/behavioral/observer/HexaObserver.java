package com.cu.dp.behavioral.observer;
import com.cu.utils.Logger;

public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		Logger.log("Hex string: " + Integer.toHexString(subject.getState()));
	}

}
