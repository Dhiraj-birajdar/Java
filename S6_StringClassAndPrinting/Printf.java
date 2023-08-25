class Printf
{
    public static void main(String[] args)
    {
        System.out.printf("%2$d  %1$d ",1,2);
        System.out.format("%2$ 6.2f  %1$(5d ",-2,3.1439);
        System.out.format("%2$-10s  %1$+5d ",-2,"dhiraj");
    }
}