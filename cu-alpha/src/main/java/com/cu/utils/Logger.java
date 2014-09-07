package com.cu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	public static void log(String message) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.S");		
		System.out.println("[" + formatter.format(new Date()) + "] " + message);
	}
	public static void log() {
		log("");
	}
	public static void separator() {
		separator(80);
	}
	public static void separator(int n) {
		log(new String(new char[n]).replace("\0", "-"));
	}
}
