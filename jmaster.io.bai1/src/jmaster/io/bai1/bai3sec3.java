package jmaster.io.bai1;
import java.util.Scanner;
public class bai3sec3 {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   int n  = sc.nextInt();
    	   giaithua(n);
       }
       public static int giaithua(int n) {
    	   int gt = 1;
    	   for(int i = 1; i <= n; i++) {
    		   gt = gt * i;
    	   }
    	   System.out.println(gt);
    	   return gt;
       }
}
