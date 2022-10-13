package trungtamjava.model;
import java.util.Scanner;
public class CourseScore {
	 private String name;
     private String id;
     private int score;
     
     public CourseScore() {
    	 
     }
     public CourseScore(String id, String name, int score) {
    	 this.id = id;
    	 this.name = name;
    	 this.score = score;
     }
     
     public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void input() {
    	 System.out.println("Enter name: ");
    	 name = new Scanner(System.in).nextLine();
    	 System.out.println("Enter id: ");
    	 id = new Scanner(System.in).nextLine();
    	 System.out.println("Enter score: ");
    	 score = new Scanner(System.in).nextInt();
     }
     public void info() {
    	 System.out.println("Name: " + name);
     	 System.out.println("Id: " + id);
     	 System.out.println("Score: " + score);
    	 if(score < 5) {
    		 System.out.println("Yeu");
    	 } else if(score >= 5 && score < 7) {
    		 System.out.println("Trung binh");
    	 } else if(score >= 7 && score < 8) {
    		 System.out.println("Kha");
    	 } else if(score >= 8 && score < 9) {
    		 System.out.println("Gioi");
    	 } else if(score >= 9) {
    		 System.out.println("Xuat sac");
    	 }
     }
     
}
