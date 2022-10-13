package jmaster.io.bai1;
import java.util.Scanner;
public class TinhToan {
         public static void main(String[] args) {
        	 Scanner sc = new Scanner(System.in);
     		int x = sc.nextInt();
     		int y = sc.nextInt();
     		tong(x,y);
     		hieu(x,y);
     		tich(x,y);
     		thuong(x,y);
         }
         public static int tong(int x, int y) {
        	 int tong = x + y;
        	 System.out.println("Tong: " + tong);
        	 return tong;
         }
         public static double tong(double x, double y) {
        	 double tong = x + y;
        	 System.out.println("Tong: " + tong);
        	 return tong;
         }
         public static int hieu(int x, int y) {
        	 int hieu = x - y;
        	 System.out.println("Hieu: " + hieu);
        	 return hieu;
         }
         public static double hieu(int x, int y) {
        	 double hieu = x - y;
        	 System.out.println("Hieu: " + hieu);
        	 return hieu;
         }
         public static int tich(int x, int y) {
        	 int tich = x * y;
        	 System.out.println("Tich: " + tich);
        	 return tich;
         }
         public static double tich(int x, int y) {
        	 double tich = x * y;
        	 System.out.println("Tich: " + tich);
        	 return tich;
         }
         public static int thuong(int x, int y) {
        	 int thuong = x / y;
        	 System.out.println("Thuong: " + thuong);
        	 return thuong;
         }
         public static double thuong(int x, int y) {
        	 double thuong = x / y;
        	 System.out.println("Thuong: " + thuong);
        	 return thuong;
         }
         
}
