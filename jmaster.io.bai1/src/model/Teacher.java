package model;
import java.util.Scanner;
public class Teacher extends Student{
     private String facility;
     public Teacher () {
    	 
     }
     public Teacher(String name, String id, String address, String major,  String facility) {
    	 super(name , id, address, major);
    	 this.facility = facility;
     }
     public void setFacility(String facility) {
    	 this.facility = facility;
     }
     public String getFacility() {
    	 return facility;
     }
     public void input(){
    	 super.input();
    	 System.out.println("Enter facility: ");
    	 facility = new Scanner(System.in).nextLine();
     }
     public void output() {
    	 super.output();
    	 System.out.println("Facility: " + facility);
     }
}
