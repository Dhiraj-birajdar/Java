package array;

public class PrimitiveArray {

	public static void main(String[] args) {
		// Declaration and initialization of an array of integers
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Accessing elements of the array
		System.out.println("Elements of the array:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

		// Modifying an element in the array
		numbers[2] = 10;
		numbers[1] = 54;
		// Displaying the modified array
		System.out.println("\nModified array:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}		
	}
}
