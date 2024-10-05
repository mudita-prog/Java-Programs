package Assignments_AB_43;

public class Assignment_104_ifElseif {

	public static void main(String[] args) 
	{
		int age =3;
		
		if (age>60)
			
		   {
			System.out.println("I am a retired pensioneer");
	       }
		
		    else if  (age>=18)
		
            {
				System.out.println("I am eligible to vote");
	     	}
			
			
			else if (age>=10)
			 
			{
				System.out.println("I am a Child");
			}
			
			else
			{
				System.out.println("I am an infant");
			}
	}
}


