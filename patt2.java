import java.io.*;
import java.util.*;
class patt2
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.printf(" "+i);
			}
			System.out.println(" \n");
		}
	}
}

/*
output of this code :
1
22
333
4444
55555
*/