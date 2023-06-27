package decision_making_statements;

import java.util.Scanner;

public class Division {
	

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int num=sc.nextInt();
		
		if(num %11 == 0)
		{
			System.out.println("Number is divisible");
		}
		else
		{
			System.out.println("Number is not divisible");
		}
		
		sc.close();
	}

}
