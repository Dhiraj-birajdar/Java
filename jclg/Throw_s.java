class Throw_s
{
    static int i = 0;
    public static void main(String[] args)
    {
        try
        {
            test2();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("end");
    }

    static void test() throws Exception
    {
        if(i==1)
            throw new Exception("Exception: Testing throw");
    }
    static void test2() throws UserDefinedException
    {
        if(i==0)
            throw new UserDefinedException();
    }
}

class UserDefinedException extends Exception
{
    public String toString()
    {
        return "UserDefinedException: exteption tested";
    }
}