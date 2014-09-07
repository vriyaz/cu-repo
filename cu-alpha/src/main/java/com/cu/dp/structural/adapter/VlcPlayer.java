package com.cu.dp.structural.adapter;
import com.cu.utils.Logger;

public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		Logger.log("Playing vlc file. Name: " + fileName);
	}

	public void playMp4(String fileName) {
		// do nothing
	}

}
