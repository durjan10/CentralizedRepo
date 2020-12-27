package AssignmentJava;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args)
	{
		int c;
		System.out.println("enter the number for the vaue");
		Scanner inputNumber = new Scanner(System.in);
		int in = inputNumber.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(+i*in);
					
		}

	}

}
