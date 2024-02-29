package multithreading;
class A extends Thread{
    public void run(){
        count1();
    }
    public static void count1(){
        for(int i = 0; i<5; i++){
            System.out.println(currentThread()+": "+i);
            try{sleep(1000);}catch(Exception e){}
        }
                   
    }
}

public class Main extends Thread
{
	public void run() {
		 for(int i = 0; i<5; i++){
		        int s = i;
		        System.out.println(s);
		    A a1 = new A();
		    a1.start();
		    }
	}
	public static void main(String[] args) {
	   Main m = new Main();

	   System.out.println(m.getPriority());
	   System.out.println(m.isDaemon());
	   System.out.println(m.getId());
	   System.out.println(m.getName());
	   System.out.println(m.getState());
	   System.out.println(m.isAlive());
	   System.out.println(m.isInterrupted());
	   m.setDaemon(true);
	   m.start();
	   System.out.println("after daemon set\n");
	   System.out.println(m.getPriority());
	   System.out.println(m.isDaemon());
	   System.out.println(m.getId());
	   System.out.println(m.getName());
	   System.out.println(m.getState());
	   System.out.println(m.isAlive());
	   System.out.println(m.isInterrupted());
		System.out.println("end of main method");
	}
}