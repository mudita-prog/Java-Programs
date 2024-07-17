package Assignments_AB_43;

import java.util.Arrays;

public class Assignment_44_Array_HowManyAlphabetsArePresent {
	

	public static void main(String[] args) {
		int count_of_alpha=0;
		String input = "Mudita Gupta@26";
		char c1[]= input.toCharArray();
		
	System.out.println(Arrays.toString(c1));
        for (int i=0;i<input.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
			count_of_alpha++;
			}
		}
		System.out.println(count_of_alpha);
	}

}
