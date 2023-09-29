public class VariableArguments {

    static void show(int...a)
    {
        for(int x:a)
            System.out.println(x);
    }
    static void show(int i, String...a)
    {
        for(String x:a)
            System.out.println(i++ +". "+x);
    }
    public static void main(String[] args) {
        
        show();
        show(1,2,3);
        show(new int[]{1,2,3}); // anonymous array
        // show({1,2,3}); // doesn't work

        show(4, "a", "b", "c");
    }
    
}
