package basic_programs;

import java.util.Scanner;

public class AreaOfPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter radius");
		int r=sc.nextInt();

		double areaP =2*3.14*r;

		System.out.println(areaP);
		sc.close();
		
	}

}
