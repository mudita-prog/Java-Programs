package Assignments_AB_43;

class GrandPaa{
	GrandPaa(int a)
	{
		System.out.println("1");
	}
}

class Mom extends GrandPaa{
	Mom(int a,char f)
	{
		super(25);
		System.out.println("9");
	}
	
}

public class Assignment_60_SuperCallingStatement_Child extends Mom {
	Assignment_60_SuperCallingStatement_Child()
	{
		super(0,'M');
		System.out.println("3");
	}


	public static void main(String[] args) {
		new Assignment_60_SuperCallingStatement_Child();
		
	}

}
