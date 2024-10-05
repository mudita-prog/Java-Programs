package Assignments_AB_43;

public class Assignment_89_StringBuffer_Methods {

	public static void main(String[] args) {

		StringBuffer a1 = new StringBuffer("Mudita");
		System.out.println(a1.capacity());
		a1.append("Gupta");
		System.out.println(a1);
		
		a1.insert(6, " Daughter of Mr.Vijay kr Gupta");
		System.out.println(a1);
		
		System.out.println(a1.indexOf("Gupta"));
		System.out.println(a1.replace(19, 30, "Mrs.Nisha"));
		
		System.out.println(a1.delete(31, 36));
		System.out.println(a1.charAt(7));
		System.out.println(a1.substring(0, 6));
		System.out.println(a1.reverse());
		System.out.println(a1.length());

	}

}
