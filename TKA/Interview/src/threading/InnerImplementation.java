package threading;

public class InnerImplementation {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("in run method");
			}
		}.start();
		
		
	}
}

