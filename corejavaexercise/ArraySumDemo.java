package ashwins;

public class ArraySumDemo {
	public static int sumofArray(int[] arr, int n) {
		if (n == 0) {
			return arr[n];
		} else {
			return arr[n] + sumofArray(arr, n - 1);
		}
	}
 
	public static void main(String[] args) {
		int[] Arr = { 16, 10, 8};
		int totalSum = sumofArray(Arr, Arr.length - 1);
		System.out.println("The sum of the array elements is: " + totalSum);
	}
 
}