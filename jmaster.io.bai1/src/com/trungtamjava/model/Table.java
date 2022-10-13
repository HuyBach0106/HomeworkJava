package com.trungtamjava.model;
import java.util.Scanner;
public class Table {
     private String name;
    
    public Table() {
    	 
     }
	public Table(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public void input() {
    	System.out.println("Enter table's name: ");
    	name = new Scanner(System.in).nextLine();
    }
    public void output() {
    	System.out.println("Table's name: " + name);
    }
}
