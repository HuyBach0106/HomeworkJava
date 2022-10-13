package main;
import trungtamjava.model.CourseScore;
import java.util.Scanner;
public class MainCourseScore {
    public static void main(String[] args) {
    	arrayScore();
    }
    public static void arrayScore() {
    	int n = new Scanner(System.in).nextInt();
    	CourseScore[] scoreArray = new CourseScore[n];
    	for(int i = 1; i < scoreArray.length; i++) {
    		scoreArray[i] = new CourseScore();
    		System.out.println("Diem cua thanh vien thu " + i);
    		scoreArray[i].input();
    	}
    	for(int i = 1; i < scoreArray.length; i++) {
    		System.out.println("Thong tin cua thanh vien thu " + i);
    		scoreArray[i].info();
    	}
    }
}
