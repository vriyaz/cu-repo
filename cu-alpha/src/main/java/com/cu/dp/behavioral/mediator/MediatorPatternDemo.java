package com.cu.dp.behavioral.mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User harry = new User("Harry");
		User rob = new User("Rob");
		User hermione = new User("Hermione");
		
		harry.sendMessage("Hello from the boy who lived");
		rob.sendMessage("Hello boy who lived");
		hermione.sendMessage("Grow up guys! this is just nonsense");
	}

}
