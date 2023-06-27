package basic_programs;

import java.util.Scanner;

public class Student_Per {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student ID:");
		sc.nextInt();
		
		System.out.println("Enter Student Name:");
		sc.next();
		
		System.out.println("Enter Student Marks For M1,M2,M3,M4,M5");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		
		int total=(m1+m2+m3+m4+m5);
		
		System.out.println("Total =" +total);
		
		double percentage=((total*100)/500.0);
		
		System.out.println("Percentage Is :" +percentage);
		
		sc.close();
		

	}

}
