package Assignments_AB_43;
abstract class Method3
{
	abstract void add();
	abstract void subtract();
}	
abstract class Method2 extends Method3
{
	void multiply()
	{
		System.out.println("3");
	}
	static void divide()
	{
		System.out.println("4");
	}
}
public class Assignment_34_abstractMethodAndConctreteMethodsExtends extends Method2 
{
	void percentage()
	{
		System.out.println("5");
	}
	static void root()
	{
		System.out.println("6");
	}
	void add()
	{
	System.out.println("1");
	}
	void subtract() 
	{
	System.out.println("2");
	}
public static void main(String[] args)
{
	Assignment_34_abstractMethodAndConctreteMethodsExtends a1=new Assignment_34_abstractMethodAndConctreteMethodsExtends();
	a1.add();
	a1.multiply();
	a1.subtract();
	a1.percentage();
	divide();
	root();
}

}
