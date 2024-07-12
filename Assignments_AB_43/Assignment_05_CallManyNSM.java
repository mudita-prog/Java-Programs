package Assignments_AB_43;
public class Assignment_05_CallManyNSM {
	void add()
	{
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
	}
	void subtract()
	{
		int e = 5;
		int f = 4;
		int g = e-f;
		System.out.println(g);
	}
	void multiply()
	{
		int m = 7;
		int n = 7;
		int o = m*n;
		System.out.println(o);
	}
	void division()
	{
		int j = 9;
		int k = 3;
		int l = j/k;
		System.out.println(l);
	}
	void modulus()
	{
		int x = 10;
        int y = 3;
        int z = x%y;
        System.out.println(z);
	}
	public static void main(String[] args) {
	
		Assignment_05_CallManyNSM nsm = new Assignment_05_CallManyNSM();
		nsm.add();
		nsm.subtract();
		nsm.multiply();
		nsm.division();
		nsm.modulus();
}
}
