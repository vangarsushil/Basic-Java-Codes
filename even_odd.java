import java.util.*;
import java.io.*;
class abc
{
	void even(int a , int b)
	{
		if(a%2==0)
		{
			System.out.println("A is  Even");
		}
		else
		{
			System.out.println("A is Odd");
		}
		
		if(b%2==0)
		{
			System.out.println("B is  Even");
		}
		else
		{
			System.out.println("B is Odd");
		}
	}
	void  swip(int a ,int b)
	{
		int c;
			if(a%2==0 || b%2==0)
			{
				System.out.println("After swaping");
				c=a;
				a=b;
				b=c;
				System.out.println("A is "+a);
				System.out.println("B is "+b);
			}
			else
			{
				System.out.println("Not any even number thats why not swaping");
			}
	}
}

class even_odd
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
			
		abc ad=new abc();
		ad.even(a,b);
		
		ad.swip(a,b);		
	}
}