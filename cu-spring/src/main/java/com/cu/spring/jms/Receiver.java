package com.cu.spring.jms;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.FileSystemUtils;

public class Receiver {

  @Autowired
  ConfigurableApplicationContext context;
  
  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
    context.close();
    FileSystemUtils.deleteRecursively(new File("activemq-data"));
  }
}
