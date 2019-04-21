import java.io.*;
import java.util.*;

class abc
{
	void add(int a , int b)
	{
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	
	void sub(int a , int b)
	{
		int c=a-b;
		System.out.println("sub is "+c);
	}
	
	void mul(int a , int b)
	{
		int c=a*b;
		System.out.println("mul is "+c);
	}
	
	void div(int a , int b)
	{
		if(b==0)
		{	
			System.out.println("Zero value not divide");
		}
		else
		{
			int c=a/b;
			System.out.println("div is "+c);
		}
	}
}
class Calculter
{
		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter two value");
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			abc ab = new abc();
			System.out.println("which Operation u want perform");
			System.out.println(" Addition  Enter 1");
			System.out.println(" Substraction  Enter 2");
			System.out.println(" Multiplication Enter 3");
			System.out.println(" Division  Enter 4");
			int c = sc.nextInt();
			
			if(c==1)
			{
				ab.add(a,b);
			}
			if(c==2)
			{
				ab.sub(a,b);
			}
			if(c==3)
			{
				ab.mul(a,b);
			}
			if(c==4)
			{
				ab.div(a,b);
			}
		}
}