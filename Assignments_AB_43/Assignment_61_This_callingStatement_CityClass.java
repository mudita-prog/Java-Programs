 package Assignments_AB_43;

public class Assignment_61_This_callingStatement_CityClass 
{
	Assignment_61_This_callingStatement_CityClass(int age)
	{
		System.out.println(age);
	}
	Assignment_61_This_callingStatement_CityClass(double weight)
	{
		this(29);
		System.out.println(weight);
	}
	Assignment_61_This_callingStatement_CityClass(String name)
	{   this(60.90);
		System.out.println(name);
	}	
public static void main(String[] args)
{
	new Assignment_61_This_callingStatement_CityClass("Mudita");
}
}
