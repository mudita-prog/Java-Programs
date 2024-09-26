package Practice;

import java.util.Scanner;
public class bus_fare1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Gender (Male/Female) - ");
	String Gender = scanner.next();
	
	if (Gender.equals("Male"))
	{
		System.out.print("Enter your Age - ");
		int age = scanner.nextInt();
		
		if (age>=18){
			System.out.println("The fare is Rs. 20");
		}
		else if (age>=8 && age<8)
		{
			System.out.println("The fare is Rs. 10");
		}
		else {
			System.out.println("The ride is free");
		}
	}
		else if (Gender.equals("Female"))
		{
			System.out.println("The ride is free");
		}
	}
	
	}
	