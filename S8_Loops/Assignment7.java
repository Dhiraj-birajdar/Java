public class Assignment7 {
     /*1,2,3,4
     * 1,2,3,4
     * 1,2,3,4
     */
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
                System.out.print(j+" ");
            System.out.println("");
        }

        System.out.println("");
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
                System.out.print(i+" ");
            System.out.println("");
        }

        System.out.println("");
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=n;j++)
                System.out.print(i+j+" ");
            System.out.println("");
        }
        // System.out.println("");
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j = i+1,k=1;k<=n;j++,k++)
        //         System.out.print(j+" ");
        //     System.out.println("");
        // }
        
        System.out.println("");
        for(int i=1,c=1;i<=n;i++)
        {
            for(int j =1;j<=n;j++)
                System.out.printf("%02d ",c++);
            System.out.println("");
        }

        System.out.println("");
        for(int i=1,c=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
                System.out.printf("%02d ",c++);
            System.out.println("");
        }

        System.out.println("");
        for(int i=0;i<n;i++)
        {
            for(int j =1;j<=n-i;j++)
                System.out.printf("%02d ",j);
            System.out.println("");
        }
    }
}
