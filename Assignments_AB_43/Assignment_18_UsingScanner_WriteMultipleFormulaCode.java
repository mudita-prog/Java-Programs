package Assignments_AB_43;
import java.util.*;
public class Assignment_18_UsingScanner_WriteMultipleFormulaCode {
final static double pi = Math.PI;
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Radius - ");
		double radius=s1.nextDouble();
		double areaCircle=pi*radius*radius;
		double circumference= 2*pi*radius;
		System.out.println("The area of the circle= "+areaCircle);
		System.out.println("The circumference of the circle= "+circumference);
		
		System.out.print("Side of the square- ");
		double side=s1.nextDouble();
		double areasq=side*side;
		double perisq=4*side;
		System.out.println("The area of the square - "+areasq);
		System.out.println("The perimeter of the square- "+perisq);
		
		System.out.print("Length of the rectangle- ");
		double Length=s1.nextDouble();
		System.out.print("Breadth of the rectangle- ");
		double Breadth=s1.nextDouble();
		double Rectanglearea=Length*Breadth;
		double periRectangle=2*(Length+Breadth);
		System.out.println("The area of the rectangle - "+Rectanglearea);
		System.out.println("The perimeter of the rectangle- "+periRectangle);
		
		System.out.print("Base of the triangle- ");
		double Base=s1.nextDouble();
		System.out.print("Height of the Triangle- ");
		double Height=s1.nextDouble();
		System.out.print("Side of the triangle- ");
		double Side=s1.nextDouble();
		double Trianglearea=0.5*Base*Height;
		double periTriangle=Base+Side+Side;
		System.out.println("The area of the Triangle - "+Trianglearea);
		System.out.println("The perimeter of the Triangle -  "+periTriangle);
	
		System.out.print("Base of the trapezium- ");
		double a=s1.nextDouble();
		System.out.print("Side1 of the trapezium- ");
		double b=s1.nextDouble();
		System.out.print("Side 2 of the trapezium- ");
		double c=s1.nextDouble();
		System.out.print("Side 3 of the trapezium- ");
		double d=s1.nextDouble();
		System.out.print("Height of the Trapezium- ");
		double h=s1.nextDouble();
		double Trapeziumarea=(a+b)*h*0.5;
		double periTrapezium=a+b+c+d;
		System.out.println("The area of the Trapezium - "+Trapeziumarea);
		System.out.println("The perimeter of the Trapezium -  "+periTrapezium);
		
	}
	

}
