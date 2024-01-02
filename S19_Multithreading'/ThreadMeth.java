class T1 extends Thread
{
    public T1(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY-1);
    }
    public void run()
    {
        int i = 0;
        while(i<0x7ce){
            System.out.println("thread 1: "+(i+=2));
            try{
                Thread.sleep(500);  // static method
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class ThreadMeth{
    public static void main(String[] args){
        T1 t = new T1("My Thread");
        System.out.println("tid: "+t.getId());
        System.out.println("tname: "+t.getName());
        System.out.println("tpriority: "+t.getPriority());
        t.setPriority(Thread.MIN_PRIORITY+1);
        System.out.println("tpriority: "+t.getPriority());
        t.start();
        System.out.println("tstate: "+t.getState());
        System.out.println("talive: "+t.isAlive());
        t.interrupt();
    }
}