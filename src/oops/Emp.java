package oops;

public class Emp {


	private int id;
	private String name;
	private double salary;
	private static int idgen=1001;
	
	
	public Emp(int id, String name, double salary)
	{
		this(); //default constructor 
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public Emp() {
		id=idgen++;//id=1001 id=1002
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double anualsalary()
	{
		double anualsal=salary*12.0;
		return anualsal ;	
	}
	public double pf()
	{
		double pf=(salary*100)/18.0;
		return pf;
	}
	
	
public String toString()
{
	return "id=:"+id+"\nName=:"+name+ "\nsalary="+salary+ "\nAnualsalary=:"+anualsalary()+"\nPf=:"+pf();
}

}
