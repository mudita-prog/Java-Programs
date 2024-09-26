package Practice;
import java.util.Scanner;
public class Bus_Fare {
	
		    public static void main(String[] args) {
		    	 Scanner scanner = new Scanner(System.in);

		         // Ask for gender
		         System.out.print("Enter your gender (male/female): ");
		         String gender = scanner.nextLine();

		         // If male, ask for age
		         if (gender.equals("male")) {
		             System.out.print("Enter your age: ");
		             int age = scanner.nextInt();

		             if (age >= 18) {
		                 System.out.println("Fare is 20.");
		             } else if (age >= 8 && age < 18) {
		                 System.out.println("Fare is 10.");
		             } else {
		                 System.out.println("Fare is free.");
		             }
		         } 
		         // If female, fare is free without asking for age
		         else if (gender.equals("female")) {
		             System.out.println("Fare is free.");
		         } 
		         // If gender is not male or female, treat it as 'other'
		        
		       

		     }
		 }