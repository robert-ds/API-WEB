package com.robert.apiweb.controller;

import com.robert.apiweb.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vasquez
 * Date: 26/9/22
 * Time: 6:19 p. m.
 */

@RestController
@RequestMapping("api")
public class DemoController {

  @RequestMapping(value="/person", method = RequestMethod.GET)
  public Person getPerson(HttpServletRequest request){
    return new Person("Juan", "Hidalgo", "87917981");
  }

}
