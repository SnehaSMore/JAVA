package practice_program;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String args[])
	{
		
	ArrayList<Integer>obj=new ArrayList<Integer>();
	
	obj.add(3);
	obj.add(5);
	obj.add(2);
	obj.add(4);
	obj.add(1);
	
	System.out.println(obj);
	
	Collections.sort(obj);
	
	System.out.println(obj);
	
	Collections.reverse(obj);
	
	System.out.println(obj);
		
		
	
	}
	
}
