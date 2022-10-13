package jmaster.io.bai1;
import java.util.Scanner;
public class bai4sec3 {
   // chu cai tung tu viet Hoa

      	public static void main(String[] args) {
      		while (true) {
      			System.out.println("Cau hoi chon dap A,B,C");

      			String s = new Scanner(System.in).nextLine();
      			char x = s.charAt(0);

      			if (x == 'A') {
      				System.out.println("Ban chon dung A");
      				break;
      			} else if (x == 'B') {
      				System.out.println("Ban chon sai B  ");
      				break;
      			} else if (x == 'C') {
      				System.out.println("Ban chon sai C  ");
      				break;
      			} else
      				System.out.println("Ban chon lai A,B,C ");
      		}
      	}
      
}
