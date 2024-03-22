package threading;
import java.util.*;
public class ComparableDemo {
	public static void main(String[] args) {
		Emp e1 = new Emp(4,"bal",34.5);
		Emp e2 = new Emp(5,"aal",34.5);
		Emp e3 = new Emp(2,"gal",14.5);
		Emp e4 = new Emp(9,"kal",64.5);
		Emp e5 = new Emp(1,"sal",84.5);
		List <Emp> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
//		System.out.println(e1.id);
		
	}
}
