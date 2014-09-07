package com.cu.dp.behavioral.observer;
import com.cu.utils.Logger;

public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		Logger.log("Octal string: " + Integer.toOctalString(subject.getState()));

	}

}
