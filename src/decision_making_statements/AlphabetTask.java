package decision_making_statements;

import java.util.Scanner;

public class AlphabetTask {		

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the character");
				char alphabet=sc.next().charAt(0);
				if(alphabet=='A' || alphabet=='a')
				{
					System.out.println("Apple");
				}
				else if(alphabet=='B' || alphabet=='b')
				{
					System.out.println("Ball");
				}
				else if(alphabet=='C' || alphabet=='c')
				{
					System.out.println("Cat");
				}
				else if(alphabet=='D' || alphabet=='d')
				{
					System.out.println("Dog");
				}
				else if(alphabet=='E' || alphabet=='e')
				{
					System.out.println("Elephant");
				}
				else if(alphabet=='F' || alphabet=='f')
				{
					System.out.println("Fan");
				}
				
				else if(alphabet=='G' || alphabet=='g')
				{
					System.out.println("Goat");
				}
				
				else if(alphabet=='H' || alphabet=='h')
				{
					System.out.println("Horn");
				}
				else if(alphabet=='I' || alphabet=='i')
				{
					System.out.println("Ice Cream");
				}
				else if(alphabet=='J' || alphabet=='j')
				{
					System.out.println("Jug");
				}
				else if(alphabet=='K' || alphabet=='k')
				{
					System.out.println("Kite");
				}
				
				else if(alphabet=='L' || alphabet=='l')
				{
					System.out.println("");
				}
				else if(alphabet=='M' || alphabet=='m')
				{
					System.out.println("Horn");
				}
				else if(alphabet=='N' || alphabet=='n')
				{
					System.out.println("Horn");
				}
				
				else
				{
					System.out.println("no matching character found");
				}
				
				sc.close();
			}

	}
