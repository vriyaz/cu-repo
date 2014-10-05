package com.cu.generics;

public class GenMax {

	public static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.printf("Max of %d, %d, & %d: %d%n", 3, 5, 4, max(3,5,4));
		System.out.printf("Max of %.1f, %.1f, & %.1f: %.1f%n", 3.1, 5.1, 4.1, max(3.1,5.1,4.1));
		System.out.printf("Max of %s, %s, & %s: %s%n", "cu", "ag", "au", max("cu","ag","au"));
	}
}
