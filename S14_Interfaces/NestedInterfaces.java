class NestedInterfaces implements ShowableExe.Message
{
    public void msg()
    {
        System.out.println("program for nested interfaces");
    }
    public static void main(String[] args)
    {
        ShowableExe.Message m = new NestedInterfaces();
        // upcasting here
        m.msg();
    }
}

interface ShowableExe
{
    void show();
    interface Message
    {
        void msg();
    }
}
