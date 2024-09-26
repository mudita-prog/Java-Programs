package Practice;

public class Constructors {

	Constructors()
	{
		int a = 10;
		int b =20;
		int c=a+b;
		
		System.out.println(c);
	}
	
	Constructors(int i,int j)
	{
		
		int k=j-i;
		
		System.out.println(k);
	}
	void add (int e,int f)
	{
		int sum = e+f;
		System.out.println(sum);
	}
	
	void add (double m,double n)
	{
		double sum = m+n;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	
		Constructors c1=new Constructors();
		c1.add(450, 500);
		c1.add(4.5, 5.5);
		Constructors c2=new Constructors(40,90);
		
	}
	}
	


