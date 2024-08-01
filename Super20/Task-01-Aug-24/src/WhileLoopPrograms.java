public class WhileLoopPrograms {
    public static void main(String[] args) {
        System.out.println(digitSum(1111));
        System.out.println(digitCount(221111));
        System.out.println(reverseNum(12345));
        System.out.println(isPalindrome(121));
        System.out.println(isArmstrong(371));
    }

    //Q20. print sum of digit of number.
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    //Q21. print count of digit of number.
    public static int digitCount(int n) {
//        int count = 0;
//        while (n>0){
//            count++;
//            n/=10;
//        }
//        return count;
        return String.valueOf(n).length();
    }

    //Q22. reverse the number.
    public static int reverseNum(int n) {
        int reverseNum = 0;
        while (n > 0) {
            reverseNum = reverseNum * 10 + n % 10;
            n /= 10;
        }
        return reverseNum;
    }

    //Q23. check given number is Pallindrome or not
    public static boolean isPalindrome(int n) {
        int reverseNum = 0, temp = n;
        while (n > 0) {
            reverseNum = reverseNum * 10 + n % 10;
            n /= 10;
        }
        return reverseNum == temp;
    }

    //Q24. check given number is Armstrong or not
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, exp = digitCount(n);
        while (n > 0) {
            sum += Math.pow(n % 10, exp);
            n /= 10;
        }
        return sum == temp;
    }
}
