package Assignments_AB_43;
class Netflix_login
{
	private String  Username= "contacta@netflix.com";
	private String Password = "Netflix123";
	
	public String getPassword()
	{
		return Password;
	}
	
	public void setPassword(String Password)
	{
		this.Password=Password;
	}

	public String getUsername()
	
	{
		return Username;
	}
	
	public void setUsername(String Username)
	{
		this.Username=Username;
	}
	
}
public class Assignment_93_Encapsulation_concept {

	public static void main(String[] args) {
	
		Netflix_login a1=new Netflix_login();
		a1.setUsername("mg@icloud.com");
		a1.setPassword("Mani3233");
		
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
	
	}
	

 
}
