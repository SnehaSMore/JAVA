package operators;

import java.util.Scanner;

public class Ternary_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c= a<b ? a :b ;
		
		System.out.println(c);
		sc.close();
	}

}
