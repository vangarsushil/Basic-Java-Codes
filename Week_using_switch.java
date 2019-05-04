import java.util.*;
import java.io.*;
class Week_using_switch
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
					
		switch(a)
		{
			case 1:
			{
				System.out.println("Monday");
				break;
			}
			
			case 2:
			{
				System.out.println("Tuesday");
				break;
			}
			
			case 3:
			{
				System.out.println("Wednesday");
				break;
			}
			
			case 4:
			{
				System.out.println("Thursday");
				break;
			}
			
			case 5:
			{
				System.out.println("Friday");
				break;
			}
			case 6:
			{
				System.out.println("Saturday");
				break;
			}
			
			case 7:
			{
				System.out.println("Sunday");
				break;
			}
			default:
			{
				System.out.println("Week Not Available");
			}
		}
	}
}