class DThread extends Thread{
    public void run(){
        int i = 0;
        while(i<1000)
            System.out.println((i+=2) + "run");
    }
}
class Daemon{
    public static void main(String[] args){
        DThread d = new DThread();
        d.setDaemon(true); // dependant thread on main thread
        d.start(); 

        // try{Thread.sleep(10);}catch(Exception e){System.out.println(e);}
        int i = 0;
        while(i<1000){
            System.out.println((i+=2) + "Main");
            Thread.yield();
        }
        Thread mainThread = Thread.currentThread();
        try{mainThread.join();}catch(Exception e){System.out.println(e);}
    }
}