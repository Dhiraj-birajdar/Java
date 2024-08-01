import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrograms {
    public static void main(String[] args) {
//        System.out.println(arraySum(new int[]{1,2,3,4,5}));
//        System.out.println(minArray(new int[]{1,2,3,4,0}));
//        printReverse(new int[]{1,2,3,4,0});
//        System.out.println(Arrays.toString(reverseArray(new int[]{1,2,3,4,5})));
//        elementCount(new int[]{1,2,3,3,2,2,1,5});
//        System.out.println(Arrays.toString(sortAsce(new int[]{1, 2, 3, 3, 2, 2, 1, 5})));
    }

    //Q25. print sum of given array
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    //Q26. print smallest number from an array.
    public static int minArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }

    //Q27. print reverse numbers of array elements.
    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }

    //Q28. generate the reverse array from given array.
    public static int[] reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return arr;
    }

    //Q29. find the count [occurance] of array elements.
    public static void elementCount(int[] arr) {
        var map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    //Q30. sort array in ascending order.
    public static int[] sortAsce(int[] arr) {
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
