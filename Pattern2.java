import java.util.*;
class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ;  j<=i ; j++)
			{
				System.out.printf(" %d " ,i);
			}
			System.out.println("\n");
		}
	}
}

/*
output :


1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */