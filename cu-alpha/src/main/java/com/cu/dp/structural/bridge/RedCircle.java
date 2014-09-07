package com.cu.dp.structural.bridge;
import com.cu.utils.Logger;

public class RedCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		Logger.log("Drawing circle [color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
