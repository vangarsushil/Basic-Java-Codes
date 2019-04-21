import java.util.*;
import java.io.*;
class Find_Small_Mid_Gretest_In_Three_Numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter one number");
			a=sc.nextInt();
		System.out.println("Enter two number");
			b=sc.nextInt();
		System.out.println("Enter three number");
			c=sc.nextInt();
			
			if(a>b)
				{
						if(a>c)
						{
							System.out.println( +a+ "is greater \t");
							
							if(b<c)
							{
								System.out.println(+b+ "is less");
								System.out.println(+c+ "is middel");
							}
							else
							{	
								System.out.println(+c+ "is less");
								System.out.println(+b+ "is middel");
							}
						}
						else
						{
							System.out.println(+c+ "is greater \t");
							
							if(a<b)
							{
								System.out.println(+a+ "is less");
								System.out.println(+b+ "is middel");
							}
							else
							{	
								System.out.println(+b+ "is less");
								System.out.println(+a+ "is middel");
							}
						}  
				}
				else
				{
					if(b>c)
					 {
						System.out.println(+b+ "is greater \t");
						
						if(a<c)
						 {
							System.out.println(+a+ "is less");
							System.out.println(+c+ "is middel");
						 }
						 else
						 {
							 System.out.println(+c+ "is less");
							 System.out.println(+a+ "is middel");
						 }
					 }
					 else
					 {
						System.out.println(+c+ "is greater \t"); 
						
						 
						 if(b<a)
						 {
							 System.out.println(+b+ "is less");
							 System.out.println(+a+ "is middel");
						 }
						 else
						 {
							 System.out.println(+a+ "is less");
							 System.out.println(+b+ "is middel");
						 }
					 }			
				}
			
	}
}