package Assignments_AB_43;

import java.util.Scanner;
public class Assignment_17_AllMethodsInScannerClass {

	public static void main(String[] args) {
		
	Scanner a = new Scanner(System.in);
	System.out.print("Roll.No - ");
	int a1 = a.nextInt();
	System.out.print("Name - ");
	String a2 = a.next();
	System.out.print("Age - ");
	int a3 = a.nextByte();
	System.out.print("Serial No. - ");
	int a4 = a.nextShort();
	System.out.print("A/c No - ");
	long a5 = a.nextLong();
	System.out.print("Height. - ");
	float a6 = a.nextFloat();
	System.out.print("Weight - ");
	double a7 = a.nextDouble();
	System.out.print("Working - ");
	boolean a8 = a.nextBoolean();
	
	
	}
}
