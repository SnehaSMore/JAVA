package looping_statements;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Number : ");
		 int num=sc.nextInt();
		  int e_count=0,o_count=0;
		  
	        int n = 1;
	        while(n<=num)
	        {
	        	if(n%2==0)
	        	{
	        	 e_count++;
	        	}
	        	else
	        	{
	        		o_count++;
	        	}
	        	n++;
	        	
	        }
	        
	        System.out.println("Even Count " +e_count);
	        System.out.println("odd Count " + o_count);
	       
	        
	        sc.close();
	        
//	        Scanner sc=new Scanner(System.in);
//			System.out.println("enter the number");
//			int n=sc.nextInt();//5
//			int evencount=0,oddcount=0;
//	       int start=1;
//	       while(start<=n)//1<=5 2<=5 3<=5 4<=5 5<=5 6<=5=f
//	       {
//	    	   if(start%2==0)//1%2==0=f 2%2==0 3%2==0 4%2==0 5%2==0
//	    	   {
//	    		   evencount++;//2
//	    	   }
//	    	   else
//	    	   {
//	    		   oddcount++;//3
//	    	   }
//	    	   
//	    	   start++;//2,3,4,5,6
//	       }
//	       System.out.println("even count=:"+evencount);//2
//		   System.out.println("odd count=:"+oddcount);//3
//		}

	        

	}
	
	
	
	
	

}
