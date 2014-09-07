package com.qq.alpha;

public class Math {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public Math(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int add() {
		return x + y;
	}
	
	public int subtract() {
		return x - y;
	}
	
	public int multiply () {
		return x * y;
	}
	
	public int divide() {
		return x / y;
	}
}