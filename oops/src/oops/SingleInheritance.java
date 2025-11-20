package oops;
import java.util.Scanner;



class Animal
{ 
	int id;
	int price;
	String name;
	String color;
	boolean IsInjected;
	String type;
	String behaviour;
	
	
	
	
}
class Dog extends Animal
{  
	void show(int id,String Price,String type,String name,String color,boolean IsInjected)
	{
		id=1;
		price=2000;
		type="germanshefard";
		name="guddu";
		color="black";
		IsInjected=true;
		
		
   System.out.println("id ="+id);
   System.out.println("price ="+price);
   System.out.println("name ="+name);
   System.out.println("color ="+color);
   if(IsInjected)
	{
		System.out.println("dog is injected not provide any  harm");
	}
	else 
	{
		System.out.println("dog is not injected ,I may provide  harm");
	}
	}
}




public class SingleInheritance {

	public static void main(String[] args)
	{ 
		
		Scanner sc=new Scanner(System.in);
		Dog d=new Dog();
//		d.show(1,"2000","german shefard","guddu","black",true);
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter price");
		String  price=sc.nextLine();
		sc.nextLine();
		System.out.println("enter type");
		String  type=sc.nextLine();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter col");
		String color=sc.nextLine();
		sc.nextLine();
		System.out.println("is safe");
		boolean IsInjected=sc.nextBoolean();
		
		d.show(id, price, type, name, color, IsInjected);
		

	}

}
