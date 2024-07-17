package Assignments_AB_43;
class Assignment_32b_MethodOverridingUsingSuperKeyword
{
	void authentication()
	{
		System.out.println("Google");
	}
}
public class Assignment_32a_MethodOverridingUsingSuperKeyword extends Assignment_32b_MethodOverridingUsingSuperKeyword
{
	void authentication()
	{
		super.authentication();
		System.out.println("Facebook");
	}

	public static void main(String[] args)
	{
		Assignment_32a_MethodOverridingUsingSuperKeyword a1= new Assignment_32a_MethodOverridingUsingSuperKeyword();
		a1.authentication();
		

	}

}
