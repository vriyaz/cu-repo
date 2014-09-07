package com.cu.algos;

import java.util.Stack;

public class TowersOfHanoi {

	public static void main(String[] args) {
		Tower source = new Tower("A");
		Tower destination = new Tower("B");
		Tower helper = new Tower("C");
		
		for (int i=5; i>0; i--)
			source.stack.push(i);
		
		move(source.stack.size(), source, destination, helper);
		
	}

	private static void move(int size, Tower source, Tower destination, Tower helper) {
		if (source.stack.isEmpty()) {
			return;
		}
		
		if (size == 1) {
			System.out.println("Move " + source.stack.peek() + " from " + source.name + " to " + destination.name);
			destination.stack.push(source.stack.pop());
			return;
		}
		
		move (size-1, source, helper, destination);
		move(1, source, destination, helper);
		move(size-1, helper, destination, source);
	}
	
	private static class Tower {
		public String name;
		public Stack<Integer> stack = new Stack<Integer>();
		
		public Tower(String name) {
			this.name = name;
		}
	}
}
