package Assignments_AB_43;
class Assignment_33b_MethodOverridingUsingFinalKeyword 
{
	void TwoFactorAuthentication()
	{
	
		System.out.println("By Mail");
	}
}
public class Assignment_33_MethodOverridingUsingFinalKeyword extends Assignment_33b_MethodOverridingUsingFinalKeyword 
{

	final void TwoFactorAuthentication()
	{
		
		System.out.println("By SMS");
	}
	
	public static void main(String[] args)
	{
		Assignment_33_MethodOverridingUsingFinalKeyword a1=new Assignment_33_MethodOverridingUsingFinalKeyword();
		a1.TwoFactorAuthentication();
	}
}
	

