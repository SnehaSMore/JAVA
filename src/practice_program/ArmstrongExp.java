package practice_program;

import java.util.Scanner;

//153: 13 + 53 + 33 = 1 + 125+ 27 = 153
//1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643

public class ArmstrongExp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int p,arm=0;
		int temp=num;
		
		while(num>0)
		{
			p=num%10;
			num=num/10;
			arm=arm+(p*p*p);			
		}

		if(temp==arm)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}

}
