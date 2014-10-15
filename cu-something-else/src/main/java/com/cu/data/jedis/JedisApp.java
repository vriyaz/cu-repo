package com.cu.data.jedis;

import static org.junit.Assert.assertEquals;
import redis.clients.jedis.Jedis;

public class JedisApp {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		
		assertEquals(value, "bar");
		jedis.close();
	}

}
