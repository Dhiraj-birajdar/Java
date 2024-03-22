package threading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(4,"bal",34.5);
		Employee e2 = new Employee(5,"aal",34.5);
		Employee e3 = new Employee(2,"gal",14.5);
		Employee e4 = new Employee(9,"kal",64.5);
		Employee e5 = new Employee(1,"sal",84.5);
		List <Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		Comparator <Employee>cr = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId() > o2.getId())
					return 1;
				else
					return -1;
			}

		};
		System.out.println(l);

		Collections.sort(l,cr);
		System.out.println(l);
	}
}
