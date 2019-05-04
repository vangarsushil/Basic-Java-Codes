import java.io.*;
import java.util.*;
class Palindrom
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int p=0,q=0,r=0;
		p=c;
		q=b;
		r=a;
		if(a==p && b==q && c==r)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
	}
}