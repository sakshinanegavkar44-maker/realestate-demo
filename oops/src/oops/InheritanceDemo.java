package oops;
class A
{
	 void display1()
	 {
		 System.out.println("class A");
	 }
}
class B extends A
{ 
	void display2()
{
	 System.out.println("class B");
}
	
}
class C extends B
{ 
	void display3()
{
	 System.out.println("class C");
}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
	
         C c=new C();
         c.display1();
         c.display2();
         c.display3();
	}

}
