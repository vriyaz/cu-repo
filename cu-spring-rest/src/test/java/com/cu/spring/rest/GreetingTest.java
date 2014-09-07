package com.cu.spring.rest;

import org.junit.Test;

import com.cu.spring.rest.Greeting;

import static org.junit.Assert.*;

public class GreetingTest {
    @Test
    public void canConstructGreeting() {
        Greeting greeting = new Greeting(1, "hello Ez!");
        assertEquals("hello Ez!", greeting.getContent());
    }
}
