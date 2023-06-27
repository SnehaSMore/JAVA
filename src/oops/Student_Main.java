package oops;

public class Student_Main {

	public static void main(String[] args) {
		
        Student s1=new Student(12345,"sneha",66,88,95,77,89);
		
		System.out.println(s1);
		System.out.println("==================================");
		Student s2=new Student(67894,"nisha",67,80,87,70,97);
		
		System.out.println(s2);
		System.out.println("======================================");
		
		Student s3=new Student();
		
		s3.setId(8888);
		s3.setName("isha");
		s3.setsub1(78);
		s3.setsub2(58);
		s3.setsub3(68);
		s3.setsub4(88);
		s3.setsub5(98);
		
		System.out.println(s3.getId());
		System.out.println(s3.getName());
		System.out.println(s3.getsub1());

		System.out.println(s3.getsub1());
		System.out.println(s3.getsub2());
		System.out.println(s3.getsub3());
		System.out.println(s3.getsub4());
	}

}
