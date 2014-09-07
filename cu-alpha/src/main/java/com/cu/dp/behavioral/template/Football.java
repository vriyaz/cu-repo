package com.cu.dp.behavioral.template;
import com.cu.utils.Logger;

public class Football extends Game {

	@Override
	void initialize() {
		Logger.log("Football initialized... start playing ...");
	}

	@Override
	void startPlay() {
		Logger.log("Football started ...");
	}

	@Override
	void endPlay() {
		Logger.log("Football ended ...");
	}

}
