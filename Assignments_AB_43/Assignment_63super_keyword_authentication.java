package Assignments_AB_43;
class super_keyword_authentication1 {
	
	void authentication()
	{
		System.out.println("Email");
	}
}
public class Assignment_63super_keyword_authentication extends super_keyword_authentication1  {
	
	void authentication()
	{
		super.authentication();
		System.out.println("OTP");
	}
	
	public static void main(String[] args) {
		Assignment_63super_keyword_authentication a1 = new Assignment_63super_keyword_authentication();
		a1.authentication();
    
	}

}
