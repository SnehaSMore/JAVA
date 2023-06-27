package operators;

import java.util.Scanner;

public class Even_Odd {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter the number: ");
			
			int num=sc.nextInt();
			
			System.out.println( num%5==0 );
			
			sc.close();
			
			
		}

	}

