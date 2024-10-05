package Assignments_AB_43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_102_NestedifElse_TrynCatchWithFinallyBlock {

	public static void main(String[] args) {
		{
		    	
			Scanner s1 = new Scanner(System.in);
		
			try
			
			{
			System.out.print("Enter Phone Number -");
			long a=s1.nextLong();
			}
			
			catch (InputMismatchException z)
			{
				System.out.println("Please enter valid Phone Number");
			
		     Scanner s2 = new Scanner(System.in);
        
				try
				
				{
				System.out.print("Enter Phone Number again -");
				long a=s2.nextLong();
				}
				catch (InputMismatchException m)
				{
					System.out.println("Please enter valid Phone Number");
					
				
				Scanner s3 = new Scanner(System.in);
		         
					try
					
					{
					System.out.print("Enter Phone Number again -");
					long a=s3.nextLong();
					}
					catch (InputMismatchException n)
					{
						System.out.println("Refresh the Page and try again");
					}
					
				}
			}
			finally
			{
				System.out.println("Thank you");
			}
		}
	}
	
}

					 
			
