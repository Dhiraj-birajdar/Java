class First {
    public static void main(String[] args) {
        try{
            int i = 3/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally execute");
        }
        
        System.out.println("end of program");
    }
}
