public class Array2d {
    public static void main(String[] args) {
        // int a[][]=new int[3][4];
        int a[][]= {{1,2,3,4},{5,6,7,8},{9,0,1,2}};

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
