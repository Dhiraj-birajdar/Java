package pk1;

class MyClass implements Cloneable {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        MyClass original = new MyClass(42);

        try {
            MyClass cloned = (MyClass) original.clone();

            System.out.println("Original value: " + original.getValue());
            System.out.println("Cloned value: " + cloned.getValue());

            // Modify the value in the original object
            original.setValue(100);

            System.out.println("Original value after modification: " + original.getValue());
            System.out.println("Cloned value after modification: " + cloned.getValue());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


//public class ObjectClass implements Cloneable{
//	
//	public Object clone() throws CloneNotSupportedException{
//		return super.clone();
//	}
//	public static void main(String[] args) throws Exception {
//		String s1 = new String("hello");
//		String s2 = new String("hello");
//		
//		System.out.println("s1.hashCode(): "+s1.hashCode()+"\ns2.hashCode(): "+s2.hashCode());
//		System.out.println(s1.equals(s2));
//		System.out.println(s1 +"\n"+ s2);
//		
//		ObjectClass o1 = new ObjectClass();
//		ObjectClass o2 = new ObjectClass();
//		
//		System.out.println("o1.hashCode(): "+o1.hashCode()+"\no2.hashCode(): "+o2.hashCode());
//		System.out.println(o1.equals(o2));
//		System.out.println(o1 +"\n"+ o2);
//		
//		ObjectClass o3 = o1.clone();
//	}
//}
