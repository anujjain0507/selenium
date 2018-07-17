package practise;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		PrintArray(arr,7);
		reverseArray(arr,0,6);
		System.out.print("Reversed array is \n");
        PrintArray(arr, 7); 

	}

	public static void reverseArray(int[] arr, int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

	public static void PrintArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
			
//		System.out.println();
		}
		
		
	}

}
