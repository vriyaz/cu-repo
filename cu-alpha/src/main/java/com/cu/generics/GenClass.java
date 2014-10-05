package com.cu.generics;

public class GenClass<X> {
	private X t;
	
	public void add(X t) {
		this.t = t;
	}
	
	public X get() {
		return t;
	}
	
	public static void main(String[] args) {
		GenClass<Integer> iClass = new GenClass<Integer>();
		GenClass<String> sClass = new GenClass<String>();
		
		iClass.add(new Integer(110));
		sClass.add(new String("hello generics!"));
		
		System.out.println("iClass: " + iClass.get());
		System.out.println("sClass: " + sClass.get());
	}

}
