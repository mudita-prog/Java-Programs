package Assignments_AB_43;

public class Assignment_35_String_Function {

	public static void main(String[] args) {
	
		String name = "Mudita";
		System.out.println(name.length());

	
		String wholename= "My name is Mudita Goyal";
		System.out.println(wholename.length());  //length
		System.out.println(wholename.toUpperCase());//Upper Case
		System.out.println(wholename.toLowerCase());//Lower Case
		System.out.println(wholename.charAt(0));//character at index
		System.out.println(wholename.charAt(21));//character at index
		System.out.println(wholename.indexOf("M"));//Index of char
		
		
		String a= "             My name is Manik Goyal            ";
		System.out.println(a.trim());// trim function
		

		String wholename1 = "My name is Mudita Goyal";
		System.out.println(wholename1.equals(wholename));//equals function
		
		String wholename2 = "My name is Manik Goyal";
		System.out.println(wholename2.equals(wholename));//equals function
		
		String wholename3 = "MY NAME IS MUDITA GOYAL";
		System.out.println(wholename3.equalsIgnoreCase(wholename));//equals ignore case
		System.out.println(wholename2.contains(wholename1));//contains
		System.out.println(wholename2.startsWith("M"));//substring startindex
		System.out.println(wholename1.endsWith("l"));//substring endindex
		System.out.println(wholename1.substring(17,23));
		
	}

}
