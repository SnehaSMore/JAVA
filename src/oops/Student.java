package oops;

public class Student {

	
	private int	id;
	private	String name;
	private int sub1,sub2,sub3,sub4,sub5;
	
	public Student()
	{
		
	}
	
	public Student(int i,String n,int s1,int s2,int s3, int s4,int s5 )
	{
		id=i;
		name=n;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
		sub5=s5;
	}
		
		public double percentage()
		{
			int total=sub1+sub2+sub3+sub4+sub5;
			
			return (total*100)/500.0;
		}
	
		public void setId(int id)
		{
			this.id=id;//1003
		}
		public int getId()
		{
			return id;//1003
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		
		public void setsub1(int sub1)
		{
			this.sub1=sub1;
		}
		public int getsub1()
		{
			return sub1;
		}
		public void setsub2(int sub2)
		{
			this.sub2=sub2;
		}
		public int getsub2()
		{
			return sub2;
		}
		public void setsub3(int sub3)
		{
			this.sub3=sub3;
		}
		public int getsub3()
		{
			return sub3;
		}
		public void setsub4(int sub4)
		{
			this.sub4=sub4;
		}
		public int getsub4()
		{
			return sub4;
		}
		public void setsub5(int sub5)
		{
			this.sub5=sub5;
		}
		public int getsub5()
		{
			return sub5;
		}
		
		
		public String toString()
		{
			return "id=:"+id+"\nName=:"+name+"\nsub1=:"+sub1+"\nsub2=:"+sub2+"\nsub3=:"+sub3+"\nsub4=:"+sub4+"\nsub5=:"+sub5+"\nPercentage=:"+percentage();
		}
		
}
