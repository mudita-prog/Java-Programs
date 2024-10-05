package Assignments_AB_43;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment_87_MapUsingFor_EachLoop {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Mudita", 98);
		m1.put("Anjali", 99);
		m1.put("Nisha", 100);
		m1.put("Sakshi", 101);
		System.out.println(m1);// it doesn't follow indexing
		
		for (Entry <String,Integer>s1 : m1.entrySet())
		{
			System.out.println(s1);
		}

	}

}
