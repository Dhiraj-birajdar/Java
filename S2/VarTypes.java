class VarTypes
{
    static int s = 20; //static variable
    int i = 30; //instance variable
    public static void main(String[] args)
    {
        int $ = 10; //local variable
        System.out.println($);
        System.out.println(s);
        //System.out.println(i);//requires object
        VarTypes v = new VarTypes();
        System.out.println(v.i);

    }
}