package AssignmentJava;

import java.util.Scanner;

public class Fabnocci 
{
	public static void main(String[] args) 
	{
		// 0 1 1 2 3 5 8 13 21 34	
		int a=0;
		int b=1;
		int c;
		System.out.println("enter the number  for fibnocci serires to print");
		Scanner inputNumber = new Scanner(System.in);
		int in = inputNumber.nextInt();
		for(int i=0;i<in;i++)
		{
			c=a+b;  // c=> 1+1=>2
			System.out.println("fibnocci series are "+c);
			a=b;    // a=> 1
			b=c;    // b=> 2			
		}
		
		

	}

}
