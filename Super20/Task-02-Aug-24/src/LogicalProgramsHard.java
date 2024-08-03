import java.util.Arrays;
import java.util.stream.Collectors;

public class LogicalProgramsHard {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(factorial(6));
        System.out.println(isNeon(9));
        printPrimeUptoN(100);
        System.out.println(nextPrime(10));
        primeArray(new int[]{5,2,4,8,7,6});
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})));
        elementCount(new int[]{1, 2, 3, 3, 2, 2, 1, 5});
        removeDuplicate(new int[]{1, 2, 3, 4, 1, 2, 3, 2});
        printEvenOdd(new int[]{5,2,4,8,7,6});
        System.out.println(sumMinMax(new int[]{5,2,4,8,7,6}));
        System.out.println(secondLargest(new int[]{5, 2, 4, 8, 7, 6}));
        fibonacciSeriesTriplet(10);
        palindromeSeries(10);
        pattern(2);
        elementCount("hello");
        System.out.println(toLowerConvert('A'));
        findDuplicateChars("hello world");
        System.out.println(charSum("ZZ"));
        duplets(new int[]{9,12,3,4,6,15,0,5,14,8,10,11},25);
        triplets(new int[]{9,12,3,4,6,15,0,5,14,8,10,11},25);
        tripletsGt(new int[]{9,12,3,14,8,10,11},25);
        transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
        unique(new int[]{1, 2, 3, 3, 2, 2, 1, 5,6,9});
        System.out.println(missingNum(new int[]{0, 1, 2, 4}));
        System.out.println(find("hello",3));
    }

    //Q1. Perfect Number Program In Java [perfect number, a positive integer that is equal to the sum of its proper divisors]
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return n == sum;
    }

    //Q2. Find Factorial of a Number Using Recursion
    public static int factorial(int n) {
        return n == 1 ? 1 : factorial(n - 1) * n;
    }

    //Q3. Neon Number Program In Java [A neon number is a number where the sum of digits of square of the number is equal to the number]
    public static boolean isNeon(int n) {
        int sum = 0, temp = n * n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return n == sum;
    }

    //Q4. Prime from range 1 to 100
    public static void printPrimeUptoN(int n) {
        System.out.print("Prime numbers from 1 to " + n + " : ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n == 1 || n % 2 == 0) return false;
        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //Q5. Find Next Prime number of given any number
    public static int nextPrime(int n) {
        if (n == 1) return 2;
        n -= n % 2 == 0 ? 1 : 2;
        while (!isPrime(n += 2)) ;
        return n;
    }

    //Q6. Java Program to find Prime numbers from an array
    public static void primeArray(int[] arr) {
        System.out.print("Prime numbers from array : ");
        for (int i : arr)
            if (isPrime(i)) System.out.print(i + ", ");
        System.out.println();
    }

    //Q7. Java Program to find Unique elements in an array of numbers.
    public static void unique(int[] arr) {
        var map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.forEach((k, v) -> System.out.print(v == 1 ? k + ", " : ""));
    }

    //Q8. Java Program to remove duplicates from an array without using the collection.
    public static void removeDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[j] = arr[j] == arr[i] ? -1 : arr[j];
            }
        }
        for (int i : arr) {
            if (i != -1) System.out.print(i + ", ");
        }
    }

    //Q9. Java Program to count occurrences of each element in an array?
    public static void elementCount(int[] arr) {
        var map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    //Q10. Java Program to Generate reverse array from given array
    public static int[] reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return arr;
    }

    //Q11. Java Program to get the odd and even numbers in a given array?
    public static void printEvenOdd(int[] arr) {
        for (int i : arr)
            System.out.println(i + " : " + (i % 2 == 0 ? "Even" : "Odd"));
    }

    //Q12. Java Program to print sum of min and maximum number from a given array?
    public static int sumMinMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return min + max;
    }

    //Q13. Java Program to find second-largest number in an array?
    public static int secondLargest(int[] arr) {
        int max1 = 0, max2 = 0;
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2)
                max2 = i;
        }
        return max2;
    }

    //Q14. "Java Program to duplets from given array or
//Q15. Find all Pairs possible from the given Array"
    public static void duplets(int[] arr, int n) {
        Arrays.sort(arr);
        for (int l = 0, r = arr.length - 1; l < r; ) {
            int sum = arr[l] + arr[r];
            if (sum == n) {
                System.out.println(arr[l++] + " - " + arr[r--]);
            } else if (sum < n)
                l++;
            else
                r--;
        }
    }

    //Q16. java program to find triplets from a given array
    public static void triplets(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {

            for (int l = i + 1, r = arr.length - 1; l < r; ) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == n) {
                    System.out.println(arr[i] + ", " + arr[l] + ", " + arr[r]);
                    break;
                } else if (sum < n)
                    l++;
                else
                    r--;
            }
        }
    }

    //Q17. java program to find triplets present in the array whose sum is more than 25.
    public static void tripletsGt(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {

            for (int l = i + 1, r = arr.length - 1; l < r; ) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum > n) {
                    System.out.println(arr[i] + ", " + arr[l] + ", " + arr[r]);
                    l++;
                } else if (sum <= n)
                    l++;
            }
        }
    }

    //Q18. Java Program to find missing numbers from array
    public static int missingNum(int[] arr) {
        return arr.length * (arr.length + 1) / 2 - Arrays.stream(arr).sum();
    }

    //Q19. Java Program to Find Transpose of a Matrix
    public static void transpose(int[][] matrix) {
        for (int[] arr : matrix)
            System.out.println(Arrays.toString(arr));
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose : ");
        for (int[] arr : transpose)
            System.out.println(Arrays.toString(arr));
    }

    //Q20. Generate Triplet Fibonnaci Series: 0 1 1 2 4 7 13 24..
    public static void fibonacciSeriesTriplet(int n) {
        int n1 = 0, n2 = 1, n3 = 1, n4 = 0;
        System.out.print("Fibonacci series : 0, 1, 1, ");
        for (int i = 4; i <= n; i++) {
            n4 = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = n4;
            System.out.print(n4 + ", ");
        }
        System.out.println();
    }

    //Q21. Generate Series: 1 121 12321 1234321
    public static void palindromeSeries(int n) {
        int num = 1, temp;
        System.out.print("Series : 1, ");
        for (int i = 2; i < n; i++) {
            temp = num * 10 + i;
            System.out.print(temp + "" + reverseNum(num) + ", ");
            num = temp;
        }
        System.out.println();
    }

    public static int reverseNum(int n) {
        int reverseNum = 0;
        while (n > 0) {
            reverseNum = reverseNum * 10 + n % 10;
            n /= 10;
        }
        return reverseNum;
    }

    //Q22. Pattern: 200 400 600, 300 600 900 1200
    public static void pattern(int n) {
        int temp = n * 100;
        n = 0;
        for (int i = 1; i <= 5; i++)
            System.out.print((n += temp) + ", ");
    }

    //Q23. Java Program to find duplicate characters in a string in java?
    //Q29. Find duplicate characters in a string
    public static void findDuplicateChars(String s) {
        var map = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.forEach((k, v) -> System.out.print(v > 1 ? (char) (int) k + ", " : ""));
    }

    //Q24. Java Program to print the occurrence of each character.
    public static void elementCount(String s) {
        var map = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.forEach((k, v) -> System.out.println((char) (int) k + " : " + v));
    }

    //Q25. "Write your own find() method with 2 parameters as String and int,
    //Q26. which works like indexOf() method in String class"
    public static String find(String s, int i) {
        return i < s.length() && i >= 0 ? String.valueOf(s.charAt(i)) : "no Char at index " + i;
    }

    //Q27. "Write your own toLowerConvert() method parameter as char value, -28. which works like toLowerCase() method in String class"
    public static char toLowerConvert(char c) {
        return c >= 65 && c <= 90 ? c += 32 : c;
    }

    //Q28. Find sum of digits from string.
    public static int stringDigitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray())
            sum += Integer.parseInt(String.valueOf(c));
        return sum;
    }

    //Q30. Java Program to sum the total number of characters in a string
    public static int charSum(String s) {
        return s.chars().sum();
    }
}
