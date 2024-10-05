package Assignments_AB_43;

public class Assignment_48_MethodOverloading {

	static void Addition() {
		System.out.println("1");
	}
	static void Addition(int a) {
		System.out.println("2");
	}
	static void Addition(char a) {
		System.out.println("3");
	}
	public static void main(String[] args) {
		
Addition();
Addition(2);
Addition('M');
	}

}
