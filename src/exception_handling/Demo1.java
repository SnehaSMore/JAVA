package exception_handling;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		try {
			
			int n=sc.nextInt();
			System.out.println(n);
			
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}


