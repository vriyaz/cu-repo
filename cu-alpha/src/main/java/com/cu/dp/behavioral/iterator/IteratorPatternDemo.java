package com.cu.dp.behavioral.iterator;
import com.cu.utils.Logger;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository names = new NameRepository();
		
		for (Iterator i = names.getIterator(); i.hasNext();) {
			String name = (String) i.next();
			Logger.log("Name: " + name);
		}
	}
}
