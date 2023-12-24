class Throws {

    static void m1() throws Exception
    {
        throw new Exception();
    }
    static void m2() throws Exception
    {
        m1();
    }
    public static void main(String[] args) {
        try{
            m2();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("end of program");
    }
}
