package com.cu.dp.behavioral.strategy;
import com.cu.utils.Logger;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new Add());
		Logger.log("10 + 5 = " + context.execute(10, 5));

		context = new Context(new Subtract());
		Logger.log("10 - 5 = " + context.execute(10, 5));
		
		context = new Context(new Multiply());
		Logger.log("10 * 5 = " + context.execute(10, 5));
		
		context = new Context(new Divide());
		Logger.log("10 / 5 = " + context.execute(10, 5));
	}

}
