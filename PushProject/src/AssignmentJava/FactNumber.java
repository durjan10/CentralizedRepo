package AssignmentJava;

import java.util.Scanner;

public class FactNumber 
{
	public static void main(String[] args) 
	{
		int fact = 1,i;
		System.out.println("enter the number for the vaue");
		Scanner inputNumber = new Scanner(System.in);
		int in = inputNumber.nextInt();
		for( i=1;i<=in;i++)
		{
			fact =fact*i;			
		}
		System.out.println("fact of given number is "+fact);
	}

}
