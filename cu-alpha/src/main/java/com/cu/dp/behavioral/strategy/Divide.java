package com.cu.dp.behavioral.strategy;

public class Divide implements Strategy {

	public int execute(int num1, int num2) {
		return (int) num1 / num2;
	}

}
