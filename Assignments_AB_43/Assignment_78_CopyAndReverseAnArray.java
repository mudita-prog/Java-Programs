package Assignments_AB_43;

import java.util.Arrays;

public class Assignment_78_CopyAndReverseAnArray {

	public static void main(String[] args) {
		
		int []Array1 = new int[4];
		Array1[0]=85;
		Array1[1]=95;
		Array1[2]=99;
		Array1[3]=15;
		int array2[]=new int[4];
		for(int i=0,k=3;i<Array1.length;i++)
		{
			array2[k]	=	Array1[i];
			k--;
					
		}
		System.out.println(Arrays.toString(Array1));
		System.out.println(Arrays.toString(array2));

	}

}
