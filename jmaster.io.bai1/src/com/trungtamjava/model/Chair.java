package com.trungtamjava.model;
import java.util.Scanner;
public class Chair {
      private String name;
      Chair() {
    	  
      }
      Chair(String name) {
    	  this.name = name;
      }
      public void setName() {
    	  this.name = name;
      }
      public String getName() {
    	  return name;
      }
      public void input() {
    	  System.out.println("Enter chair's name: ");
    	  name = new Scanner(System.in).nextLine();
      }
      public void output() {
    	  System.out.println("Chair's name: " + name);

      }
}
