package collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentExm_Main {
	
	//package sortcollection;

	

	

		public StudentExm_Main(int i, String string, int j, int k, int l, int m, int n) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			StudentExm_Main s1=new StudentExm_Main(1001,"sathya",67,89,90,67,99);
			
		
			
			StudentExm_Main s2=new Student(1002,"hari",77,90,77,90,77);
			
			
			
			Student s3=new Student(1003,"priya",57,90,67,80,77);
			ArrayList<Student>list=new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			System.out.println(list);
			System.out.println("=======================sort");
			Collections.sort(list);
			System.out.println(list);

		}

	}

}
