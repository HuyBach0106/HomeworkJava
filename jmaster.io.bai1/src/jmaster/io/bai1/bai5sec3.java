package jmaster.io.bai1;
import java.util.Scanner;
public class bai5sec3 {
	
		public static void main(String[] args) {
			array();
		}

		public static void array() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] numberArray = new int[n];
			System.out.println(numberArray.length);	
			
			for (int index = 0; index < numberArray.length; index++) {
				System.out.println("nhap vao phan tu so " + index);
				numberArray[index] = new Scanner(System.in).nextInt();
			}

			System.out.println("Danh sach phan tu");
			for (int i = 0; i < numberArray.length; i++) {
				System.out.println(numberArray[i]);
			}

			// tong
			int t = 0;
			for (int i = 0; i < numberArray.length; i++) {
				t += numberArray[i];
			}
			System.out.println("Tong la: " + t);

			// MIN MAX
			int min = numberArray[0];
			for (int i = 1; i < numberArray.length; i++) {
				if (min > numberArray[i])
					min = numberArray[i];
			}
			int max = numberArray[0];
			for (int i = 1; i < numberArray.length; i++) {
				if (max < numberArray[i])
					max = numberArray[i];
			}
			System.out.println("MIN: " + min);
			System.out.println("MAX: " + max);

			// sap xep tang dan 3 3 4 5 8
			// doi cho, bubble sort-
			for (int i = 0; i < numberArray.length - 1; i++) {
				for (int k = i + 1; k < numberArray.length; k++) {
					if (numberArray[i] > numberArray[k]) {
						int x = numberArray[i];
						numberArray[i] = numberArray[k];
						numberArray[k] = x;
					}
				}
			}
		}
	}

