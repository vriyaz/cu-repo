package com.cu.dp.behavioral.template;
import com.cu.utils.Logger;

public class Cricket extends Game {

	@Override
	void initialize() {
		Logger.log("Cricket initialized... start playing ...");
	}

	@Override
	void startPlay() {
		Logger.log("Cricket started ...");
	}

	@Override
	void endPlay() {
		Logger.log("Cricket ended ...");
	}

}
