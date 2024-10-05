package Assignments_AB_43;;

class Example {
	int value;
    Example(int value) {
    	this.value = value;
       System.out.println("COnstructor 1");
    }
    
    Example() {
        this(10);
        System.out.println("Constructor 2");
    }  
}
public class Assignment_64_ThisKeyword {
    public static void main(String[] args) {
    	Example a = new Example(25);
        Example a1 = new Example (); // Calls the parameterized constructor
       // Calls the default constructor

       
    }
}

