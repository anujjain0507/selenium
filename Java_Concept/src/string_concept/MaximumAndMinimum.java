package string_concept;

public class MaximumAndMinimum {
	static int max;
	static int min;
	
	public static void max(int arr[]) {
		max=arr[0];
		for(int i = 0;i <= arr.length;i++) {
			if(arr[i] > max) {
				System.out.println("the max value is "+ max);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,15,54,54,24,98,102,35};
		for(int i = 0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		

	}
	

}
