package operators;

import java.util.Scanner;

public class Student_detail {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student ID:");
	   int id=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String name=sc.next();
		
		System.out.println("Enter Student Marks For M1,M2,M3,M4,M5");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		
		System.out.println(" ");
		
		int total=(m1+m2+m3+m4+m5);	
		
		double percentage=((total*100)/500.0);
		
		

		System.out.println("Enter Student ID:" +id);
		
		System.out.println("Enter Student Name:" +name);
		
		System.out.println("M1 To M5 Total Marks =" +total);
		
		System.out.println("Percentage Is :" +percentage);
		
		
		
		if(percentage >90)
		{
			System.out.println("Grade A");
		}
		else if(percentage> 80 && percentage< 90)
		{
			System.out.println("Grade B");
		}
		else if (percentage>70 && percentage<80) 
		{
				System.out.println("Grade C");
		}
		else if (percentage>60 && percentage<70)
		{
			System.out.println("Grade D");
		}
		else if (percentage>50 && percentage<60)
		{
			System.out.println("Grade E");
		}
		else if (percentage<50)
		{
			System.out.println("Fail");
		}
			
		sc.close();
		

	}

}
