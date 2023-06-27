package looping_statements;

import java.util.Scanner;

public class FactorExp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.err.println("Enter The Numer :");//6
		
		int num=sc.nextInt();
		System.err.println("");
		int i=1;
		
		while(i<=num)//1<=6 2<=6
		{
			if(num%i==0)//6%1==0 6%2==0 
			{
				System.err.println(i);
			}
			i++;
		}
		
		
	
		/*	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the inputs");
				int n=sc.nextInt();//6
				int start=1;
				while(start<=n)//1<=6 2<=6 3<=6 4<=6 5<=6 6<=6
				{
					if(n%start==0)//6%1==0 6%2==0 6%3==0 6%4==0 6%5==0 6%6==0
					System.out.println(start);//1,2,3,6
					}
					start++;//2,3,4,5,6
				}

			}*/
		
		
		
		
		
		
		/*do {
			if(num%i == 0) {
				System.out.println(i);
			}
			i++;
			
			} 
		while(i <= num);*/
		
		sc.close();
	}
	
}
	
	
	
	
	
