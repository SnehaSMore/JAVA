package npd_string;

import java.util.Scanner;

public class BufferExp {

	public static void main(String[] args) {

		       StringBuffer s=new StringBuffer("hello");
		       System.out.println(s);
		       s.append("hai");
		       System.out.println(s);
		       
		       
		    
		       		Scanner sc=new Scanner(System.in);
		       		System.out.println("enter the Sentence");
		       		String sentence=sc.nextLine();
		       		String change=sentence.replace('d', 't');
		       		System.out.println(change);

		       	}

	/*4.WAP 

doDay is dhe besD Day of my life

d,'t':

toDay is the best Day of my life*/
		       
		       
		     //  System.out.println(s1);
		      
		            /* StringBuffer s=new StringBuffer("hello");
		              System.out.println(s);
		              s.append("hai");
		              System.out.println(s);
		              s.insert(3, "welcome");
		              System.out.println(s);
		              s.replace(0, 3, "wor");
		              System.out.println(s);
		              System.out.println(s.reverse());
		              s.delete(0, 4);
		              System.out.println(s);*/
		       
		       
		              
		       	}

//		       }


	
