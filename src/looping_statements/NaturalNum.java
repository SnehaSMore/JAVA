package looping_statements;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter any number : ");
		 int num=sc.nextInt();
		 
		 System.out.println("Natural numbers from 1 to " + num);

	        int n = 1;
	        while(n<=num)
	        {
	        	 System.out.println(n + "");
	        	 n++;
	        }
	        
	        sc.close();
	}

}
