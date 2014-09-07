package com.cu.dp.structural.bridge;
import com.cu.utils.Logger;

public class GreenCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		Logger.log("Drawing circle [color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
