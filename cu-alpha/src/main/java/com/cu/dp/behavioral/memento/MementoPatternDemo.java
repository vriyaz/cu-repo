package com.cu.dp.behavioral.memento;
import com.cu.utils.Logger;

public class MementoPatternDemo {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");
		
		Logger.log("Current state: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		Logger.log("First saved state: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		Logger.log("Second saved state: " + originator.getState());
		
	}

}
