package Assignments_AB_43;

public class Assignment_49_ConstructorOverloading {
	
	Assignment_49_ConstructorOverloading()
	{
		System.out.println("2");
	}
	
	Assignment_49_ConstructorOverloading(int a, String b)
	{
		System.out.println("3");
	}

	public static void main(String[] args) {
		
		new Assignment_49_ConstructorOverloading();
		new Assignment_49_ConstructorOverloading(5,"Mudita");
	}

}
