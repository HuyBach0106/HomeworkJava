package jmaster.io.bai1;

import java.util.Scanner;

public class PhanLoaiDanSo {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int age = sc.nextInt();
		 PhanLoai(age);
	 }
     public static void PhanLoai(int age) {
    	 if(age < 1) {
    		 System.out.println("Tre so sinh");
    	 } else if(age == 1 || age <= 3) {
    		 System.out.println("Em be");
    	 } else if(age >= 18 && age < 40) {
    		 System.out.println("Nguoi lon");
    	 } else if(age >= 40 && age <= 60) {
    		 System.out.println("Trung nien");
    	 } else if(age == 60) {
    		 System.out.println("Nguoi gia");
    	 }
     }
}
