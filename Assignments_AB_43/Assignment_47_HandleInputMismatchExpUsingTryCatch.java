package Assignments_AB_43;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment_47_HandleInputMismatchExpUsingTryCatch {

		public static void main(String[] args)
		{
	    int age []= new int[3];	
		Scanner s1 = new Scanner(System.in);
         
		try
		{
		for (int i =0;i<3;i++)
		{
		System.out.print("Enter age -");
		age[i]=s1.nextInt();
		}
		}
		catch (InputMismatchException z)
		{
			System.out.println("Exception handled");
		}
		catch (ArrayIndexOutOfBoundsException y)
		{
			System.out.println("Second Exception also handled");
		}
		}}