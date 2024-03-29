public class A1_Method {

    static boolean prime(int a) {
        if (a == 1)
            return true;
        for (int i = 2; i < a / 2; i++)
            if (a % i == 0)
                return false;
        return true;
    }

    static int gcd(int a, int b) {
        while (a != b) {
            if(a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    static int max(int[] a) {
        int m = 0;
        for (int x : a)
            if (x > m)
                m = x;
        return m;
    }

    public static void main(String[] args) {
        int a = 10, b = 10, arr[] = { 1, 3, 9, 5, 6 };
        System.out.println("is " + a + " prime : " + prime(a));
        System.out.println("gcd of " + a + " and " + b + " : " + gcd(a, b));
        System.out.println(max(arr));
    }
}
