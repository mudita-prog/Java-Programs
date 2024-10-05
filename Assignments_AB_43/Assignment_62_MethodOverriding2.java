package Assignments_AB_43;

class Assignment_62_MethodOverriding
{
	void authentication()
	{
		System.out.println("Mobile no.");
	}
	
}
public class Assignment_62_MethodOverriding2 extends Assignment_62_MethodOverridingUsingSuperKeyword
{
	void authentication()
	
	{
	super.authentication();
		System.out.println("Email Id");
	}
public static void main(String[] args)
{
	Assignment_62_MethodOverriding a1=new Assignment_62_MethodOverriding();
			a1.authentication();
}

}
