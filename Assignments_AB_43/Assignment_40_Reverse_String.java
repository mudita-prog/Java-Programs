package Assignments_AB_43;

public class Assignment_40_Reverse_String {

	public static void main(String[] args) {
		
		String input = "mom";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--)
		{
		char c1=input.charAt(i);
	    output=output+c1;}
	    System.out.println(output);
		
	     if (input.contentEquals(output))// checks if string is palindrome or not.
	     {
	    	 System.out.println("The given String is a Palindrome");
	     }
	     else
	     {
	    	 System.out.println("This given output is not a palindrome");
	     }
/*	
i=5;output = l
i=4;output = l+o+o = lo
i=3;output = lo+o = loo
i=2;output = loo+h
i=1;output = looh+c
i=1;output = loohc+s
	}*/

}}
