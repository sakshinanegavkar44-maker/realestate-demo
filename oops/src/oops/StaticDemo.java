package oops;

public class StaticDemo
{  
	static String companyName;
	int id;
	String name;
  void display( int id,String name)
{
	
		System.out.println("Comapnyname "+companyName);//we can use static member in non static context
	System.out.println("id"+id);
	System.out.println("name"+name);
	
	
}
static void cn()
{
	companyName="tcs";
	//System.out.println("name"+name);//we can not use non static member in static context
	//System.out.println("name"+this.name);//we can not use this in static context
//System.out.println("name"+super.name);//we can not use super keyword in static context
}

	public static void main(String[] args) 
	{    
	    StaticDemo.cn();
		StaticDemo s =new StaticDemo();
		s.display(1,"sakshi" );
		
	}

}
