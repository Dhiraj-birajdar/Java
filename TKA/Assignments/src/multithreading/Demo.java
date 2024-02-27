package multithreading;

class Square extends Thread{
    void square(){
        System.out.println("square method thread: "+Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            System.out.println(i+"^2 = "+(i*i));
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
    public void run(){
        square();
    }
}
class Cube implements Runnable{
    void cube(){
        System.out.println("cube method thread: "+Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            System.out.println(i+"^3 = "+(i*i*i));
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
    public void run(){
        cube();
    }
}

public class Demo
{
	public static void main(String[] args){
		System.out.println("main method thread: "+Thread.currentThread().getName());
		Square s = new Square();
		Thread c = new Thread(new Cube());
		long start = System.currentTimeMillis();
		s.start();
		c.start();
		try{s.join();}catch(Exception e){}
		try{c.join();}catch(Exception e){}
		long total = (System.currentTimeMillis() - start)/1000;
		System.out.println("total time: "+total);
	}
}

