package Assignments_AB_43;

public class Assignment_14_AreaAndCircumferenceOfCircle {
	
	static void Area_of_Circle()
	{
		int r = 2;
		float pi = 3.14f;
		double area = pi*r*r;
		
		System.out.println(area);
		
	}
	
	static void Circumference_of_Circle()
	{
		int r = 5;
		float pi = 3.14f;
		double circumference = 2*pi*r;
		
		System.out.println(circumference);
	}

	public static void main(String[] args) {
		
		Area_of_Circle();
		Circumference_of_Circle();

	}

}
