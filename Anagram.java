package Automation_Class_43;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "race";
		String s2 = "care";
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		System.out.println("After sorting the words - "+Arrays.toString(c1));
		/*
		Arrays.sort(c2);
		System.out.println("After sorting the words - "+Arrays.toString(c2));
		
		boolean b1 = Arrays.equals(c1, c2);
		System.out.println(b1);
		
		if (b1==true)
		{
			System.out.println("This is an anagram");
		}
		else
			System.out.println("This is not an anagram");
		*/
	}
}
