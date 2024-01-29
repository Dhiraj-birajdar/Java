package pack1;

//Example of using private access modifier
class PrivateExample {
	private int privateVariable;

	private void privateMethod() {
		System.out.println("This is a private method.");
	}
}


//Example of default access modifier (no modifier)
class DefaultExample {
	int defaultVariable; // default access modifier

	void defaultMethod() { // default access modifier
		System.out.println("This is a default (package-private) method.");
	}
}

//Example of accessing members from another class
public class AccessModifiers {
	public static void main(String[] args) {

		PublicExample publicObj = new PublicExample();
		publicObj.publicVariable = 10;
		publicObj.publicMethod();

		// PrivateExample privateObj = new PrivateExample(); // This would compile
		// privateObj.privateVariable = 20; // This would cause a compilation error
		// privateObj.privateMethod(); // This would cause a compilation error

		ProtectedExample protectedObj = new ProtectedExample();
		protectedObj.protectedVariable = 30;
		protectedObj.protectedMethod();

		DefaultExample defaultObj = new DefaultExample();
		defaultObj.defaultVariable = 40;
		defaultObj.defaultMethod();
	}
}
