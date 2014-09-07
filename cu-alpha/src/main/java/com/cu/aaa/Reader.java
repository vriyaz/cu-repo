package com.cu.aaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	
	static String readLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		
		try {
			string = br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		return string;
	}
	
	static Integer readInteger() {
		return new Integer(readLine());
	}
	
	static Float readFloat() {
		return new Float(readLine());
	}
	
	public static void main(String[] args) {
		
		System.out.println("string: " + readLine());
		System.out.println("integer: " + readInteger());
		System.out.println("float: " + readFloat());
		return;
	}

}
