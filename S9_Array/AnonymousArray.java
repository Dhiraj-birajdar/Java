public class AnonymousArray {

    static void printArray(int[]a)
    {
        for(int e: a)
            System.out.print(e+" ");
    }
    public static void main(String[] args) {
        
        printArray(new int[]{1,2,3,4}); //passing anonymous array
    }
    
}
