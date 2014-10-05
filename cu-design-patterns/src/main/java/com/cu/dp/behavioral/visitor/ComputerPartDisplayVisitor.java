package com.cu.dp.behavioral.visitor;
import com.cu.utils.Logger;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Computer computer) {
		Logger.log("Displaying computer");
	}

	public void visit(Mouse mouse) {
		Logger.log("Displaying mouse");
	}

	public void visit(Keyboard keyboard) {
		Logger.log("Displaying keyboard");
	}

	public void visit(Monitor monitor) {
		Logger.log("Displaying monitor");
	}

}
