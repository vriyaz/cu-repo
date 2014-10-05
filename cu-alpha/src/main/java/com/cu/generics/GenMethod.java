package com.cu.generics;

public class GenMethod {

	public static <E> void print(E[] input) {
		for (E element : input) {
			System.out.printf(" %s ", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'h', 'e', 'l', 'l', 'o' };
		print(intArray);
		print(doubleArray);
		print(charArray);
	}
}
