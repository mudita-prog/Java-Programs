package Assignments_AB_43;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Assignment_81_iterationofStackandVectorusingEnumeration {

		    public static void main(String[] args) {
		      
		        Stack<String> stack = new Stack<>();
		        stack.push("First");
		        stack.push("Second");
		        stack.push("Third");

		       
		        Enumeration<String> stackEnumeration = stack.elements();

		        
		        System.out.println("Stack elements:");
		        while (stackEnumeration.hasMoreElements()) 
		        {
		        System.out.println(stackEnumeration.nextElement());
		        }

		        
		        Vector<String> vector = new Vector<>();
		        vector.add("Apple");
		        vector.add("Banana");
		        vector.add("Cherry");

		        
		        Enumeration<String> vectorEnumeration = vector.elements();

		       
		        System.out.println("\nVector elements:");
		        while (vectorEnumeration.hasMoreElements()) {
		        System.out.println(vectorEnumeration.nextElement());
		  
		}

	}
}
