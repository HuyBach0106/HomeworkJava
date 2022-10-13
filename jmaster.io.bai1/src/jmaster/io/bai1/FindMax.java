package jmaster.io.bai1;
import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	timMax(a, b ,c);
    }
    public static void timMax(int a, int b, int c) {
    	int max = 0;
    	int max1 = 0;
    	max = a > b ? a : b;
    	max1 = max > c ? max : c;
    	System.out.println("Max can tim la: " + max1);
    }
}
