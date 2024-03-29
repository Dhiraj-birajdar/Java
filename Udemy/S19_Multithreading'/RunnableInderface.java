class RunnableInderface implements Runnable{

    public void run()
    {
        int i = 0;
        while(true)
        {
            System.out.println((i++)+" hello");
        }
    }
    public static void main(String[] args){
        RunnableInderface r = new RunnableInderface();
        Thread t = new Thread(r);
        t.start();


        int i = 0;
        while(true)
        {
            System.out.println((i++)+" hello world");
        }
    }
}