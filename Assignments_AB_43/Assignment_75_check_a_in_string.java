package Assignments_AB_43;

public class Assignment_75_check_a_in_string {

	public static void main(String[] args) {
String name = "Alphabetical";

System.out.println(name.contains("a"));

String lowerName = name.toLowerCase();

int count = lowerName.length() - lowerName.replace("a", "").length();


if (count > 0) {
    System.out.println("The letter 'a' is present in the string " + count + " times.");
} else {
    System.out.println("The letter 'a' is not present in the string.");
}

	}

}
