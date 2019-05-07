package string_concept;

public class MaximumAndMinimum {

	static int[] arr = { 10, 15, 54, 54, 24, 98, 102, 35 };
// First Method
	
	/*public static int largest() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int Smallest() {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
	}*/
	
	
// Second Method
	public static void Smallest_Largest() {
		int[] arr = {  2,1,2,3,4,5,65,76,5,4,34,232,3,2323 };
		int smallest = arr[0];
		int largest = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > largest){
				largest = arr[i];
			}else if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest number is : "+ smallest);
		System.out.println("Largest number is : "+ largest);
	}

	public static void main(String[] args) {
//		System.out.println("Smallest in given array is " + Smallest());
//		System.out.println("Largest in given array is " + largest());
		Smallest_Largest();
	}

}
