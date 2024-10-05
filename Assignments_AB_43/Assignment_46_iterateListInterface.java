package Assignments_AB_43;

import java.util.ArrayList;
import java.util.List;

public class Assignment_46_iterateListInterface {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
        a1.add("Apple");
        a1.add("Banana");
        a1.add("Cherry");
        a1.add("Date");
        a1.add("Strawberry");
        
       
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));

	}

}
}