package com.cu.dp.behavioral.state;
import com.cu.utils.Logger;

public class StartState implements State {

	public void execute(Context context) {
		Logger.log("player is in start state");
		context.setState(this);
	}
	public String toString() {
		return "Start State";
	}
}
