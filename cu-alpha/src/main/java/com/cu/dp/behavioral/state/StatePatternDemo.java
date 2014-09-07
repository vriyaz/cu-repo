package com.cu.dp.behavioral.state;
import com.cu.utils.Logger;

public class StatePatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.execute(context);
		
		Logger.log(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.execute(context);
		
		Logger.log(context.getState().toString());

	}

}
