package Assignments_AB_43;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment_79_Iteration_ArrayListIterator {

		public class IteratorExample {
		    public static void main(String[] args) {
		       
		        ArrayList<String> list = new ArrayList<>();
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Cherry");
		        list.add("Date");

		        
		        Iterator<String> iterator = list.iterator();
		        System.out.println("ArrayList elements:");
		        while (iterator.hasNext()) {
		            String element = iterator.next();
		            System.out.println(element);
		        }
		    }
		}
	}

