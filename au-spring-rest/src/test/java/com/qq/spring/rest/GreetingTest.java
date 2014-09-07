package com.qq.spring.rest;

import org.junit.Test;

import com.qq.spring.rest.Greeting;

import static org.junit.Assert.*;

public class GreetingTest {
    @Test
    public void canConstructGreeting() {
        Greeting greeting = new Greeting(1, "hello Ez!");
        assertEquals("hello Ez!", greeting.getContent());
    }
}
