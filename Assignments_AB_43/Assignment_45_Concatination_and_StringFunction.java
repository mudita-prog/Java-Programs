package Assignments_AB_43;

import java.util.Arrays;

public class Assignment_45_Concatination_and_StringFunction {

	public static void main(String[] args) {
	String intro = "My name is Mudita";
	String[]a1 = intro.split(" ");
	String[]a2 = intro.split(" ",4);
	
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
	}

}
