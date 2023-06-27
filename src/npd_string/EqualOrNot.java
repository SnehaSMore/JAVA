package npd_string;

import java.util.Scanner;

public class EqualOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter User Name:");
		String U_name=sc.next();
		
		System.out.println("Enter Password:");
		String password=sc.next();
		
		
		if(U_name.equals(password))
		{
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("Invalid User");
		}
		sc.close();
	}
	
	
	
	/*	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the username");
			String username=sc.next();
			System.out.println("enter the pwd");
			String pwd=sc.next();
			if(username.equals("admin") && pwd.equals("123"))
			{
				System.out.println("welcome to Edubridge");
			}
			else
			{
				System.out.println("Invalid User");
			}

		}

	}*/
	
	
	}
