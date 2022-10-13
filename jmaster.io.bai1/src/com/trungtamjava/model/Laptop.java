package com.trungtamjava.model;
import java.util.Scanner;
public class Laptop {
     private String name;
     public Laptop() {
    	 
     }
     public Laptop(String name) {
    	 this.name = name;
     }
     public void setName() {
    	 this.name = name;
     }
     public String getName(String name) {
    	 return name;
     }
     public void input() {
    	 System.out.println("Enter laptop's name: ");
    	 name = new Scanner(System.in).nextLine();
     }
     public void output() {
    	 System.out.println("Laptop's name: " + name);
     }
}
