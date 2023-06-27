package looping_statements;

import java.util.Scanner;

public class FactorialUsingFor {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.err.println("Enter Number :");
		int num=sc.nextInt();
		int i,factorial=1;
		sc.close();
		for(i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		
		System.err.println("Factorial Is :" +factorial);
		
		
	
	}
}