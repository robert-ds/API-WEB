package com.robert.apiweb.model;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/9/22
 * Time: 6:24 p. m.
 */

public class Person {

  public String name;
  public String lastName;
  public String DNI;

  public Person(){}

  public Person(String name, String lastName, String DNI){
    this.name = name;
    this.lastName = lastName;
    this.DNI = DNI;
  }

  // Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDNI() {
    return DNI;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
  }

}
