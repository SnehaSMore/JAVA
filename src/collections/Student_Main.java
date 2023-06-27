package collections;

import java.util.ArrayList;

public class Student_Main {

	public static void main(String[] args) {
		
        Student s1=new Student(12345,"sneha",66,88,95,77,89);
		
		System.out.println(s1);
		System.out.println("==================================");
		Student s2=new Student(67894,"nisha",67,80,87,70,97);
		
		System.out.println(s2);
		System.out.println("======================================");
			
			
			
			Student s3=new Student(1003,"priya",57,90,67,80,77);
			
			ArrayList<Student>list=new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			System.out.println(list);
	}

}
