package Assignments_AB_43;

import java.util.Scanner;

public class Assignment_16_Creating_Form_usingScanner {

	public static void main(String[] args) {
		
		Scanner form= new Scanner(System.in);
		System.out.print("First Name - ");
		String a=form.nextLine();
		
		System.out.print("Last Name - ");
		String b=form.nextLine();
		
		System.out.print("Email Id - ");
		String c=form.nextLine();
		
		System.out.print("Password - ");
		String d=form.nextLine();
		
		System.out.print("Gender - ");
		String e=form.nextLine();
		
		System.out.print("Present Address - ");
		String f=form.nextLine();
	
		
		System.out.print("Permanent Address - ");
		String g=form.nextLine();
		
		System.out.print("Pincode - ");
		long h=form.nextLong();
		
	}

}
