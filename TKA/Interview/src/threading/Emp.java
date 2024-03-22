package threading;

public class Emp implements Comparable <Emp>{
	private int id ;
	private String name;
	private double salary ;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	@Override
	public int compareTo(Emp o) {
		return this.name.compareToIgnoreCase(o.getName());
//		if(this.id > o.id)
//			return 1;
//		else
//			return -1;
	}
	@Override
	public String toString() {
		return "Emp: "+id+","+name+","+salary+"\n";
	}
}

