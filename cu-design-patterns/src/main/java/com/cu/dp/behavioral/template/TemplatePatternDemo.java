package com.cu.dp.behavioral.template;
import com.cu.utils.Logger;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		Logger.log();
		game = new Football();
		game.play();
	}
}
