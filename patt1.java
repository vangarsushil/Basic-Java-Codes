import java.io.*;
import java.util.*;
class patt1
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				if((i+j)%2==0)
				{
					System.out.printf(" 1 ");
				}
				else
				{
					System.out.printf(" 0 ");
				}
			}
			System.out.println(" \n");
		}
	}
}

/*
output of this code :

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/