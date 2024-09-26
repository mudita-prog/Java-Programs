package Practice;

import java.util.Date;

import java.util.Date;

import java.util.Date;

public class String_Function {

	public static void main(String[] args) {
	
		String name = "Mudita Gupta";
		String sentence = "It's raining cats and dogs";
		
		System.out.println(sentence.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(sentence.length());
		System.out.println(name.charAt(5));
		System.out.println(name.contains("Mani"));
		System.out.println(name.indexOf('u'));
		System.out.println(sentence.trim());
		System.out.println(name.equals("Mudita Gupta"));
		System.out.println(name.equalsIgnoreCase("mudita gupta"));
		System.out.println(sentence.startsWith("I"));
		System.out.println(sentence.endsWith("S"));
		System.out.println(sentence.substring(1, 9));
		System.out.println(sentence.replace(' ', '_'));
		System.out.println(sentence.replaceAll(sentence, "It's a Frog-strangler"));
		System.out.println(sentence.replaceAll("[A-z]", ""));
		System.out.println(sentence.matches("I(.*)s"));
		System.out.println(sentence.matches("(.*)z(.*)"));
		System.out.println(sentence.concat(name).concat("Manik"));
		

	}
	

}
