package com.trungtamjava.model;
import java.util.Scanner;
public class Person {
	 private String name;
     private String id;
     private int point;
     private String sex;
     public Person() {
   
     }
     public Person(String id, int point, String sex) {
    	 this.id = id;
    	 this.point = point;
    	 this.sex = sex;
     }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void input() {
		System.out.println("Enter name: ");
		name = new Scanner(System.in).nextLine();

		System.out.println("Enter id: ");
		id = new Scanner(System.in).nextLine();
		
		System.out.println("Enter sex: ");
		sex = new Scanner(System.in).nextLine();
		
		System.out.println("Enter point: ");
		point = new Scanner(System.in).nextInt();
	}
	public void output() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Sex: " + sex);
		System.out.println("Point: " + id);
	}
}
