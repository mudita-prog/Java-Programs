package Practice;

public class Reverse_a_String {

	public static void main(String[] args) {
	
		String input = "Mudita";
		String output = "";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			char a1 = input.charAt(i);
			output = output+a1;
		}
		System.out.println(output);
		/*
		for (int i=a.length()-1;i>=0;i--)
		{
			char a1 = a.charAt(i);
			b = b+a1;
		}
		System.out.println(b);
		
		*/

	}

}
