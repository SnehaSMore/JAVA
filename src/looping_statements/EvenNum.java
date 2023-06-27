package looping_statements;

import java.util.Scanner;

public class EvenNum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Number : ");
		 int num=sc.nextInt();
		 
		

	        int n = 1;
	        while(n<=num)
	        {
	        	if(n%2==0)
	        	 System.out.println(n + "");
	        	 n++;
	        }
	        
	        sc.close();
	        
//	        
//	        System.out.println("enter the number");
//			int n=sc.nextInt();//5
//			int start=1;
//			while(start<=n)//1<=5-2<=5 3<=5 4<=5 5<=5 6<=5
//			{
//				if(start%2==0)//1%2==0 2%2==0 3%2==1 4%2==0 5%2==0
//				{
//				System.out.println(start);//2,4
//				}//1---5
//				start++;//2,3,4,5,6
	}

}


