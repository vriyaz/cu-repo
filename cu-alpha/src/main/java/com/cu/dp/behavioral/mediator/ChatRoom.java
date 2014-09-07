package com.cu.dp.behavioral.mediator;
import java.util.Date;

import com.cu.utils.Logger;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		Logger.log(new Date() + " [" + user.getName() + "]: " + message);
	}
}
