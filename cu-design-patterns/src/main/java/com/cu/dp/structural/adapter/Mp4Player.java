package com.cu.dp.structural.adapter;
import com.cu.utils.Logger;

public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		// do nothing
	}

	public void playMp4(String fileName) {
		Logger.log("Playing mp4 file. Name: " + fileName);
	}

}
