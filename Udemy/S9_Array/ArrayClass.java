public class ArrayClass {
    public static void main(String[] args) {
        
        int a[]; // array declaration
        a = new int[3]; //array instantiation
        a[0] = 1; //array initialization

        int b[] = {1,2,3}; //array   declare,instantiate,initialize

        Class c = b.getClass();
        String cname = c.getName();
        System.out.println(cname);

        System.out.println(cname.getClass().getName());
    }
    
}
