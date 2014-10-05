package com.cu.dp.behavioral.interpreter;
import com.cu.utils.Logger;

public class InterpreterPatternDemo {

	public static Expression getMaleExpression() {
		Expression e1 = new TerminalExpression("Rob");
		Expression e2 = new TerminalExpression("Sam");
		return new OrExpression(e1, e2);
	}
	
	public static Expression getMarriedWomanExpression() {
		Expression e1 = new TerminalExpression("Julie");
		Expression e2 = new TerminalExpression("Married");
		return new OrExpression(e1, e2);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		Logger.log("Sam is male? " + isMale.interpret("Sam"));
		Logger.log("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
	}

}
