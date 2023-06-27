package npd_string;

import java.util.Scanner;

public class StrExp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String fname=sc.next();
		
		System.out.println("Enter Last Name:");
		String lname=sc.next();
		
		System.out.println(fname + " " +lname);
		
		System.out.println("Full Name :" +fname.concat(lname));
		
		sc.close();
	}

}
