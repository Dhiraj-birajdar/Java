public class JaggedArray {
    public static void main(String[] args) {
        
        // int a[][];
        // a = new int[3][];
        // a[0] = new int[1];
        // a[1] = new int[2];
        // a[2] = new int[3];

        int a[][]={{1},{2,3},{4,5,6}};
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println("");
        }

        for(int r[]:a)
        {
            for(int c:r)
                System.out.print(c+" ");
            System.out.println("");
        }

    }
    
}
