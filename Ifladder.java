import java.util.*;
class sub
{
	int subject()
	{	
		Scanner sc= new Scanner(System.in);
		int m,s,e;
		System.out.println("Enter math marks");
		m=sc.nextInt();
		
		System.out.println("Enter since marks");
		s=sc.nextInt();
		
		System.out.println("Enter english marks");
		e=sc.nextInt();
		
		int a=m+s+e;
		int i=a/3;
		return i;
		
	}
}

class Ifladder
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		sub sb=new sub();
		sb.subject();	
		
		int i=0;
		
		if(i>=1 && i<=35)
		{
			System.out.println("Fail");
		}
		
		if(i>=35 && i<=40)
		{
			System.out.println("gread D Jaa pass kale tula");
		}
		if(i>=41 && i<=50)
		{
			System.out.println("gread C tu pan pass");
		}
		
		if(i>=51 && i<=60)
		{
			System.out.println("gread B second class pass");
		}
		
		if(i>=61 && i<=80)
		{
			System.out.println("gread A First class");
		}
		if(i>=81 && i<=100)
		{
			System.out.println("gread A+");
		}
	}
}