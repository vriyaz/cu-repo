package com.cu.spring.hateoas;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

  private static final String TEMPLATE = "Hello, %s!";

  /**
   * Return the simple greeting message.
   * 
   * @param name
   *          - input name
   * @return response object
   */
  @RequestMapping("/greeting")
  @ResponseBody
  public HttpEntity<Greeting> greeting(
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    Greeting greeting = new Greeting(String.format(TEMPLATE, name));
    greeting.add(linkTo(methodOn(GreetingController.class).greeting(name))
        .withSelfRel());

    return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
  }
}
