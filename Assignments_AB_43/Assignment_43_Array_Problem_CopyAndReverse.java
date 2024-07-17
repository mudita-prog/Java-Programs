package Assignments_AB_43;

import java.util.Arrays;

public class Assignment_43_Array_Problem_CopyAndReverse {

	public static void main(String[] args)
	{
		int input[]=new int[3];
		input[0]=89;
		input[1]=10;
		input[2]=75;
		int output[]=new int[3];
		
		for (int i=0;i<=2;i++)
		{
			output[i]=input[i];                     
		}
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(output));
	}

}
