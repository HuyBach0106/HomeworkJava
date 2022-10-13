package jmaster.io.bai1;
import java.util.Scanner;
public class IfElse {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Nhap vao 1 so x: ");
    	  int x = sc.nextInt();
    	  check(x);
    	  checkChiaHet(x);
      }
      public static int checkChiaHet(int a) {
    	  if(a % 2 == 0) {
    		  System.out.println(a + " la so chia het cho 2");
    	  }
    	  return a;
      }
      public static int check(int a) {
    	  if(a > 0) {
    		  System.out.println("a la so > 0 ");
    	  } else if(a < 0) {
    		  System.out.println("a la so < 0");
    	  } else System.out.println("a la so == 0");
    	  switch(a) {
    	  case 0: {
    		  System.out.println("a == 0");
    		  break;
    	  }
    	  case 1: {
    		  System.out.println("a == 1");
    		  break;
    	  
    	  }
    	  default:
    		  System.out.println("No value");
      }
    	  return a;
}
}
