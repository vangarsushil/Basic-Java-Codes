import java.util.*;
import java.io.*;
class Week
{
	void abc(int a)
	{
		if(a==1)
		{
			System.out.println("MOnday");
		}
		
		if(a==2)
		{
			System.out.println("Thuresday");
		}
		
		if(a==3)
		{
			System.out.println("Wensday");
		}
		
		if(a==4)
		{
			System.out.println("Thuesday");
		}
		if(a==5)
		{
			System.out.println("Friday");
		}
		if(a==6)
		{
			System.out.println("saterday");
		}
		if(a==7)
		{
			System.out.println("sunday");
		}
	}
}
class Abc
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			
			int a= sc.nextInt();
			
			Week wk= new Week();
			we.abc(a);
	}
}
	