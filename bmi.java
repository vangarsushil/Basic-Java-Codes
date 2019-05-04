  /*bmi calculater
	wight km 
	hight cm
*/
import java.util.*;
import java.io.*;
class abc
{
	void agee(float w, float h , int e)
	{
		if(e<=20 || e<=30)
		{
			if((h>=150 || h<=160) &&(w<=90 || w<=140))
			{
				System.out.println("your hight and wight is ok");
				float a =(w/h/h)*(10000);
				System.out.println("your BMI is "+a);
			}
			else
			{
				if(w>=45)
				{
					System.out.println("overwight");
				}
				else
				{
					System.out.println("underwight");
				}
			}
		}
		else
		{
			System.out.println("Out of range your age");
		}
	}
}
class bmi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter wight");
		float w = sc.nextFloat();
		abc c =new abc();
					
		if(w<=100)
		{
			System.out.println("Enter hight");
			float h = sc.nextFloat();
			
			
			System.out.println("Enter age");
			int e=sc.nextInt();
			c.agee(w,h,e);
		}
		else
		{
			System.out.println("Over wighted");
		}
		
	}
}