package com.cu.dp.behavioral.state;
import com.cu.utils.Logger;

public class StopState implements State {

	public void execute(Context context) {
		Logger.log("player is in stop state");
		context.setState(this);
	}
	public String toString() {
		return "Stop State";
	}
}
