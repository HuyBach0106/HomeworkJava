package model;
import java.util.Scanner;
public class Student {
    private String name;
    private String id;
    private String address;
    private String major;
    public Student() {
    	
    }
    public Student(String name, String id, String address, String major) {
    	this.name = name;
    	this.id = id;
    	this.address = address;
    	this.major = major;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
    public void input() {
    	System.out.println("Enter name: ");
    	name = new Scanner(System.in).nextLine();
    	System.out.println("Enter id: ");
    	id = new Scanner(System.in).nextLine();
    	System.out.println("Enter address: ");
    	address = new Scanner(System.in).nextLine();
    	System.out.println("Enter major: ");
    	major = new Scanner(System.in).nextLine();
    }
    
    public void output() {
    	System.out.println("Name: " + name);
    	System.out.println("Id: " + id);
    	System.out.println("Address: " + address);
    	System.out.println("Major: " + major);
    }
    
}
