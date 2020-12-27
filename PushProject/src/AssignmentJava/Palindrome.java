package AssignmentJava;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
//		String original ="NITIN";
		System.out.println("enter the number for the vaue");
		Scanner inputNumber = new Scanner(System.in);
		String original = inputNumber.nextLine();
		String reverse ="";
		int length = original.length();
		for(int i=length-1;i>=0;i--)		
		{
			reverse = reverse+original.charAt(i);
			System.out.println("reverse string is "+reverse);
			
			if(original.equals(reverse))
			{
				System.out.println("given String is palindrome "+original);
			}
			else
			{
				System.out.println("given String is not palindrome "+original);
			}
		}
	}

}
