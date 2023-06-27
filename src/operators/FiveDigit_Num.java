package operators;

import java.util.Scanner;

public class FiveDigit_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		System.out.println(num>=10000 && num<99999);
		
		sc.close();
		
		
	}

}
