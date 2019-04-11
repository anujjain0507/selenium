package string_concept;

public class MaximumAndMinimum {

	static int[] arr = { 10, 15, 54, 54, 24, 98, 102, 35 };

	public static int largest() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int Smallest() {
		int min = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("Smallest in given array is " + Smallest());
		System.out.println("Largest in given array is " + largest());
	}

}
