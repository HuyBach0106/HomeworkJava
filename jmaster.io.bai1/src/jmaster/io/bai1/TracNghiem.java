package jmaster.io.bai1;

import java.util.Scanner;

public class TracNghiem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("Chon dap an A - D");
			String s = input.nextLine();
			char chon = s.charAt(0)
			switch (chon) {
			case 'A':
				System.out.println("Ban da chon dap an A");
				break;
			case 'B':
				System.out.println("Ban da chon dap an B");
				break;
			case 'C':
				System.out.println("Ban da chon dap an C");
				break;
			case 'D':
				System.out.println("Ban da chon dap an D");
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
	}
     }

