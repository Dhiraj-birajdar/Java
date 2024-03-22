package hash_equals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Runner {
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		Map<Employee, String> emp = new HashMap();
		emp.put(e1, "jack");
		emp.put(e2, "jack");
		System.out.println(emp.size());
		System.out.println(e1.hashCode());
		System.out.println(e2);
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Map<Integer, String> in = new HashMap();
		in.put(i1, "one");
		in.put(i2, "one");
		System.out.println(in.size());
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
//		System.out.println(i2.eq);
		System.out.println(new Runner());
		
	}
}

class Employee{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}

	
}
