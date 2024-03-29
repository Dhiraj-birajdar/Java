class Nest {

    static void m1()
    {
        int n = 4/0;
    }
    static void m2()
    {
        m1();
    }
    public static void main(String[] args) {
        try{
            // m2();
            try{
                int a = 5/0;
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        catch(ArithmeticException e){
            // System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("end of program");
    }
}
