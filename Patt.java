import java.util.*;
class Patt
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				int x=i+j-1; 
				if(x>4)
				{
					System.out.print("  "+(x-4));
				}
				else
				{
					System.out.print("  "+x);
				}
			
			}
			System.out.println(" ");
		}
			System.out.println(" ");
					
	}
}