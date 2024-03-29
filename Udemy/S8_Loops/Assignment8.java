public class Assignment8 {
    /*
     * star patterns
     */
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(j<i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i+j<=n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i+j<=n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for(int k =1;k<i;k++)
                System.out.print("* ");

            System.out.println("");
        }

        System.out.println("");
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(j<i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for(int k =1;k<=n-i;k++)
                System.out.print("* ");

            System.out.println("");
        }


        System.out.println("");
        for(int i=1;i<=n-1;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i+j<=n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for(int k =1;k<i;k++)
                System.out.print("* ");

            System.out.println("");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(j<i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for(int k =1;k<=n-i;k++)
                System.out.print("* ");

            System.out.println("");
        }
    }
}
