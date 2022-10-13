package main;
import java.util.Scanner;

import model.Student;
import model.Teacher;
public class MainStudentTeacher {
      public static void main(String[] args) {
    	  print();
      }
      
      public static void print() {
    	  int n = new Scanner(System.in).nextInt();
    	  Student [] studentArray = new Student[n];
    	  Teacher[] teacherArray = new Teacher[n];
    	  for(int i = 1; i < studentArray.length; i++) {
    		  studentArray[i] = new Student();
    		  System.out.println("Hoc sinh thu " + i);
    		  studentArray[i].input();
    	  }
    	  for(int i = 1; i < studentArray.length; i++) {
    		  System.out.println("Thong tin hoc sinh thu " + i);
    		  studentArray[i].output();
    	  }
    	  for(int i = 1; i < teacherArray.length; i++) {
    		  teacherArray[i] = new Teacher();
    		  System.out.println("Giao vien thu " + i);
    		  teacherArray[i].input();
    	  }
    	  for(int i = 1; i < teacherArray.length; i++) {
    		  System.out.println("Thong tin giao vien thu " + i);
    		  teacherArray[i].output();
    	  }
    	  
      }
}
