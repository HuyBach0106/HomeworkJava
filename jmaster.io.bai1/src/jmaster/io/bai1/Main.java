package jmaster.io.bai1;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        	
        	// Square
        	Scanner sc = new Scanner(System.in);
            double SideofSquare = sc.nextDouble();
            System.out.println("The perimeter and the area of the Square is: ");
            double PerimeterSquare = Square.Perimeter(SideofSquare);
            double AreaSquare = Square.Area(SideofSquare);
            System.out.println(PerimeterSquare);
            System.out.println(AreaSquare);
            
            // Rectangle
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            System.out.println("The perimeter and the area of the Rectangle is: ");
            double PerimeterRectangle = Rectangle.Perimeter(length, width);
            double AreaRectangle = Rectangle.Area(length, width);
            System.out.println(PerimeterRectangle);
            System.out.println(AreaRectangle);
            
            // Circle
            double radius = sc.nextDouble();
            System.out.println("The perimeter and the area of the Circle is: ");
            double PerimeterCircle = Circle.Perimeter(radius);
            double AreaCircle = Circle.Area(radius);
            System.out.println(PerimeterCircle);
            System.out.println(AreaCircle);
            
            //
        }
        
}
