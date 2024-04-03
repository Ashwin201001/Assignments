package April;

public class Genericmain {
	   public static void main(String[] args) {
	       Integer[] numbers = {1, 2, 3, 4, 5};
	       System.out.println("Original array:");
	       printArray(numbers);
	       // Swap elements at index 1 and 3
	       GenericUtils.swap(numbers, 1, 3);
	       System.out.println("Array after swapping:");
	       printArray(numbers);
	   }
	   private static <T> void printArray(T[] arr) {
	       for (T item : arr) {
	           System.out.print(item + " ");
	       }
	       System.out.println();
	   }
	}