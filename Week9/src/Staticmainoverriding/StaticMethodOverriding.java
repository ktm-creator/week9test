package Staticmainoverriding;

class A
{
	public static void m1()
	{
		System.out.println("Parent");
	}	
}
class B extends A{
	public static void m1()
	{
		System.out.println("Child");
	}
}

public class StaticMethodOverriding {

	public static void main(String[] args) {
		A aRef = new B(); // have to ask 
		A.m1();
		aRef.m1(); // static method get run at compile time 
       // final methods cannot be overridden or shadows
	}

}
