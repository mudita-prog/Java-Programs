package Assignments_AB_43;


import java.util.Arrays;

public class Assignment_45_Array_HowManyNumbersandSpacesArePresent {
	

	public static void main(String[] args) {
		int count_of_alpha=0;
		int count_of_numbers=0;
		int count_of_space=0;
		
		String input = "Mudita Gupta@@26";
		char c1[]= input.toCharArray();
		
	System.out.println(Arrays.toString(c1));
        for (int i=0;i<input.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			
			if(b1==true)
			{
			count_of_alpha++;
			}
			
			if(b2==true)
			{
			count_of_numbers++;
			}
			
			if(b3==true)
			{
			count_of_space++;
			}
		}
		System.out.println(count_of_alpha);
		System.out.println(count_of_numbers);
		System.out.println(count_of_space);
		int count_of_specialCharacters = input.length()-(count_of_alpha+count_of_numbers+count_of_space);
		System.out.println(count_of_specialCharacters);
		
	}

}
