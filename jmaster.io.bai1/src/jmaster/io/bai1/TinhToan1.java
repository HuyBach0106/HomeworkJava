package jmaster.io.bai1;
import java.lang.Math;
import java.util.Scanner;
public class TinhToan1 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int a = sc.nextInt();
    	 int b = sc.nextInt();
    	 SquareRoot(a);
    	 exponentialFunction(a);
    	 mulPi(a);
    	 equationdegree1(a, b);
    			 
     }
     public static double SquareRoot(int a) {
    	 double sqrta = Math.sqrt(a);
    	 System.out.println("The Square Root of a is: " + sqrta);
    	 return sqrta;
     }
     public static double  exponentialFunction(int a) {
    	 double  exponentiala = Math.pow(a, 2);
    	 System.out.println("The  square of a is: " + exponentiala);
    	 return exponentiala;
     }
     public static double mulPi(double a) {
    	 double mul = 3.14 * a;
    	 System.out.println("The multiplication of a and Pi is: " + mul);
    	 return mul;
     }
     
     public static double equationdegree1(int a, int b) {
    	 double root1 = 0;
    	  System.out.println("Equation: " + a + "x + " + b + " = 0");
          if (a == 0) {
              if (b == 0) {
                  System.out.println("The equation have many roots !");
              } else {
                  System.out.println("The equation have no root !");
              }
          } else {
              root1 = (double) -b / a;
              System.out.println("The root of equation is:  " + root1);
          }
          return root1;
      }
}
