package jmaster.io.bai1;
import java.util.Scanner;
import java.lang.Math;
public class GiaiPhuongTrinhBac2 {
    
	
	// pt bac 2
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        giaiPTBac2(a, b, c);
    }
     
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
	
	
	// Lam menu
	public static void menu() {
		while(true) {
		System.out.println("MENU");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("Vui long chon tu 1 - 3: ");
		int n = new Scanner(System.in).nextInt();
		if(n == 1) {
			System.out.println("1");
			break;
		} else if(n == 2) {
			System.out.println("2");
			break;
		} else if(n == 3) {
			System.out.println("3");
			break;
		} else {
			System.out.println("Vui long nhap lai: ");
		}
	  }
		System.out.println("END");
	}
	
}
