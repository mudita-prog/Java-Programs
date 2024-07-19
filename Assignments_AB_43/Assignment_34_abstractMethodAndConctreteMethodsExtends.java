package Assignments_AB_43;
interface Grand_Parent
{
	void abstract_method1();
	void abstract_method2();
}
interface Parent extends Grand_Parent 
{
	void abstract_method3();
	void abstract_method4();
}
public class Assignment_34_abstractMethodAndConctreteMethodsExtends implements Parent 
{	
public static void main(String[] args) {
	Assignment_34_abstractMethodAndConctreteMethodsExtends s1 = new Assignment_34_abstractMethodAndConctreteMethodsExtends();
	s1.abstract_method1();
	s1.abstract_method2();
	s1.abstract_method3();
	s1.abstract_method4();

}
public void abstract_method1() 
{
	System.out.println("1");
}
public void abstract_method2() {	
	
System.out.println("1");
}
public void abstract_method3() {
	System.out.println("1");
}
public void abstract_method4() {
	System.out.println("1");
}}
