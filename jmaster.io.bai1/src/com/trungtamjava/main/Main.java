package com.trungtamjava.main;
import com.trungtamjava.model.Person;
import com.trungtamjava.model.Laptop;
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
    	  
    	  personArray();
    	  laptopArray();
      }
    public static void laptopArray() {
    	int n = new Scanner(System.in).nextInt();
		Laptop [] laptopArray  = new Laptop[n];
		for(int i = 0; i < laptopArray.length; i++) {
			System.out.println("Laptop cua thanh vien thu " + i);
			laptopArray[i] = new Laptop();
			laptopArray[i].input();
		}
		for(int i = 1; i < laptopArray.length; i++) {
			System.out.println("Thong tin laptop thanh vien thu " + i);
			laptopArray[i].output();
		}
    }
    public static void  personArray() {
    			int n = new Scanner(System.in).nextInt();
    			Person [] personArray  = new Person[n];
    			
    			for (int i = 0; i < personArray.length; i++) {
    				System.out.println("Thanh vien thu " + i);
    				personArray[i] = new Person();
    				personArray[i].input();
    			}

    			for (int i = 1; i < personArray.length; i++) {
    				System.out.println("Thong tin hoc vien thu " + i);
    				personArray[i].output();
    			}
      }
}

