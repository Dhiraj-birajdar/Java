package problems;

public class Patterns {
    public static void main(String[] args) {
        printSquare(9);
        print4Square(9);
        printSquareDiag(9);
		print4SquareDiag(9);
    }
    public static void printSquare(int n){
	    for(int i=1;i<=n;i++){
	        for(int j = 1;j<=n;j++){
	            if(i==1||j==1||i==n||j==n)
	                System.out.print("* ");
                else
    	            System.out.print("  ");

	        }
	       System.out.println();
	    }
	}
	public static void print4Square(int n){
	    for(int i=1;i<=n;i++){
	        for(int j = 1;j<=n;j++){
	            if(i==1||i==Math.ceilDiv(n,2)||j==1||j==Math.ceilDiv(n,2)||i==n||j==n)
	                System.out.print("* ");
                else
    	            System.out.print("  ");

	        }
	       System.out.println();
	    }
	}
	public static void printSquareDiag(int n){
	    for(int i=1;i<=n;i++){
	        for(int j = 1;j<=n;j++){
	            if(i==1||i==j||j==1||i+j==n+1||i==n||j==n)
	                System.out.print("* ");
                else
    	            System.out.print("  ");

	        }
	       System.out.println();
	    }
	}
	public static void print4SquareDiag(int n){
	    for(int i=1;i<=n;i++){
	        for(int j = 1;j<=n;j++){
	            if(i==1||i==j||j==1||i==Math.ceilDiv(n,2)||j==Math.ceilDiv(n,2)||i+j==n+1||i==n||j==n)
	                System.out.print("* ");
                else
    	            System.out.print("  ");

	        }
	       System.out.println();
	    }
	}
}
