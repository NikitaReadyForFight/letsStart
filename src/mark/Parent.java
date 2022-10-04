package mark;

import java.util.*;

class Head
{
	
	int a, b,c;
	
	Scanner sc = new Scanner(System.in);
	
	void add()
	{
		System.out.println("Enter the value of a & b");
		a = sc.nextInt();
		b= sc.nextInt();
		
		c= a+b;
		System.out.println(" the output is: "+c);
	}
	void mul()
	{
		
		System.out.println("Enter the value of a & b");
		a = sc.nextInt();
		b= sc.nextInt();
		c= a-b;
		System.out.println(" the output is: "+c);
		
	}
	
}
class Sub extends Head
{
	Scanner sc = new Scanner(System.in);
	
	void mul()
	{
		
		System.out.println("Enter the value of a & b");
		a = sc.nextInt();
		b= sc.nextInt();
		c= a*b;
		System.out.println(" the output is: "+c);
		
	}
}

public class Parent {
	
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Head h = new Sub();
		h.mul();
		
		}
}



