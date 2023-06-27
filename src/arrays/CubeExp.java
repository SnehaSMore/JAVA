package arrays;

import java.util.Scanner;

public class CubeExp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		 System.out.println("your outputs");
			
			
		 for(int i=0;i<size;i++)
		 { 
			 System.out.println(a[i]); 
			 System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
			 sum=sum+(i*i*i);
			 System.out.println("Sum is:" +sum);
		 }
		 
	
		 sc.close();
	}
	
		/*
		 
		 package Arrays;

			import java.util.Scanner;
			
			public class CubeArray {
			
				public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the size");
					int size=sc.nextInt();//3
					int a[]=new int[size];
					int cube=0;
					for(int i=0;i<size;i++)//0<3 1<3 2<3
					{
						 a[i]=sc.nextInt();//a[0]=1 a[1]=2 a[2]=3
						 cube=cube+(a[i]*a[i]*a[i]);//cube=0+1*1*1=1 cube=1+(2*2*2)=9
						 //cube=9+(3*3*3)=27+9=36
					}
					System.out.println("The cube of array=:"+cube);//36
			
				}
			
			}
		 
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
