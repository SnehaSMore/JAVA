package basic_programs;

import java.util.*;

public class AreaOfCircle
{

	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter radius");
		int r=sc.nextInt();

		double areaC =3.14*r*r;

		System.out.println(areaC);
		sc.close();

	}
}