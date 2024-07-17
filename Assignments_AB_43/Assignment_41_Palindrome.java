package Assignments_AB_43;
public class Assignment_41_Palindrome {
public static void main(String[] args) {
		
		String input = "dad";
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
}
}