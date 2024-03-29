class UnitObj
{
    static private int n = 2;
    static public UnitObj uo= null;
    static UnitObj getInstance()
    {
        if(uo == null || n > 0)
            uo = new UnitObj();
            n--;
            System.out.println(n+" obj "+uo);
        return uo;
    }
}

class Singleton
{
    public static void main(String[] args)
    {
        UnitObj o1 = UnitObj.getInstance();
        UnitObj o2 = UnitObj.getInstance();
        UnitObj o3 = UnitObj.getInstance();

        if(o1 == o2 || o2 == o3)
            System.out.println("same");
        else
            System.out.println("different");
        System.out.println(o1);

    }
}