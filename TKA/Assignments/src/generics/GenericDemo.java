package generics;

public class GenericDemo <T, A>{
	public T data;
	 A s;
	T ar[] = (T[]) new Object[5];
	T add(T data) {
		System.out.println(s);
		return data;		
	}
	
	public static void main(String[] args) {
		GenericDemo<String,Integer> gd = new GenericDemo<>();
		System.out.println(gd.add("hello"));
	}

}
