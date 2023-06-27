package decision_making_statements;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Year");
		
		int year=sc.nextInt();
		
		if(year % 4 == 0)
		{
			System.out.println("This is LeapYear");
		}
		else
		{
			System.out.println("This is Not LeapYear");
		}
		
		sc.close();
	}

}
