package Assignments_AB_43;
public class Assignment_03_Many_Static_Methods_in_Main_Method {
	
	public static void Addition() 
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	static void Subtraction() 
	{
		int e = 10;
		int f = 20;
		int g = f-e;
		System.out.println(g);
	}
	static void Multiplication() 
	{
		int i = 2;
		int j = 5;
		int k = i*j;
		System.out.println(k);
	}
	public static void Division() 
	{
		int  x= 2;
		int  y= 7;
		int  z= y/x;  //it will always show the quotient - 3
		System.out.println(z);
	}
	public static void Modulus() 
	{
		int  no1= 7;
		int  no2= 2;
		int  mod=no1%no2; //it will always show the reminder 7/2 = quotient - 3, remainder - 1
		System.out.println(mod);
	}
    public static void main(String[] args) {
	Addition();
	Subtraction();
	Multiplication();
	Division();
	Modulus();
	}
}
