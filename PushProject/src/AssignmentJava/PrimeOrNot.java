package AssignmentJava;

import java.util.Scanner;

public class PrimeOrNot 
{
	public static void main(String[] args)
	{
		int flag =0;
		System.out.println("enter the number for fibnocci serires to print");
		Scanner inputNumber = new Scanner(System.in);
		int in = inputNumber.nextInt();

       for(int i=2;i<=in/2;i++)
       {
    	 if(in%i==0)
    	 {
    		 System.out.println("Given number is not prime number "+in);
    		 flag=1;
    		 break;
    	 }
    
       }
  	 if(flag==0)
	 {
		 System.out.println("Number nuber is prime "+in);
	 }	 
		

	}


}
