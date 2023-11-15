class Excep
{
    public static void main(String[] args)
    {
        System.out.println(returns());
    }
    static int returns()
    {
        try{
            return 5;
        }
        finally{
            System.out.println("After return");
        }
    }
}