package decision_making_statements;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The age of person");
		
		int age=sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Eligible To Vote");
		}
		else
		{
			System.out.println("Not Eligible To Vote");
		}
		
		sc.close();
	}

	}


