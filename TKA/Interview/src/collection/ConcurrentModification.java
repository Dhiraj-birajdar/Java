package collection;
import java.util.*;
public class ConcurrentModification {
	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList<>();
		l.add(1);
		l.add(5);
		l.add(4);
		l.add(4);
		l.add(1);
		System.out.println(m());
		for(Integer i : l) {
			if(i == 1)
				l.remove(i);
			System.out.println(i);
		}
	}
	
	static Object m() {
		String s = "hello";
		return s;
	}
}
