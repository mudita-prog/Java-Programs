package Assignments_AB_43;

class Assignment_31b_MethodOverriding
{
	void authentication()
	{
		System.out.println("Mobile no.");
	}
	
}
public class Assignment_31a_MethodOverriding extends Assignment_31b_MethodOverriding
{
	void authentication()
	
	{
	super.authentication();
		System.out.println("Email Id");
	}
public static void main(String[] args)
{
	Assignment_31a_MethodOverriding a1=new Assignment_31a_MethodOverriding();
			a1.authentication();
}

}
