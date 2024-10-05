package Assignments_AB_43;
import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment_80_WAP_iterationArrayListusingListIterator {
	    public static void main(String[] args) {
	        
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        ListIterator<String> listIterator = list.listIterator();
	        
	        System.out.println("ArrayList elements:");
	       
	        while (listIterator.hasNext()) {
	            String element = listIterator.next();
	            System.out.println(element);
	        }

	        System.out.println("\nIterating in reverse:");
	        while (listIterator.hasPrevious()) {
	            String element = listIterator.previous();
	            System.out.println(element);
	        }
	    }
	

	}

