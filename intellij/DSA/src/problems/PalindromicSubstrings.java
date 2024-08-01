package problems;


public class PalindromicSubstrings {


	public static void main(String[] args) {
		System.out.println(countSubstrings("abc"));
	}
	static public int countSubstrings(String s) {
	    int res=0;
	    for(int i=0;i<s.length();i++){
	        for(int j = s.length()-1;j>=i;j--){
//                System.out.println(s.substring(i,j+1));
	            if(isPalindrome(s.substring(i,j+1)))
	                res++;
	        }
	    }
        return res;
    }
    static private boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1; i<s.length()/2;i++,j--){
//            System.out.println(s.charAt(i));
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }

}
