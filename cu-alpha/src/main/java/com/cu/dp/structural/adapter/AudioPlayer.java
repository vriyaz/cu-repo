package com.cu.dp.structural.adapter;
import com.cu.utils.Logger;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	public void play(String audioType, String fileName) {
	
		if (audioType.equalsIgnoreCase("mp3")) {
			Logger.log("playing mp3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			Logger.log("Invalid media. " + audioType + " format not supported");
		}
	}

}
