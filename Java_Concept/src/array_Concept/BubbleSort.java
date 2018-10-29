package array_Concept;

public class BubbleSort {
	
	public static void main(String [] args) {
		int arr[] = {11,15,41,54,25,12,84,65,24};
		
		System.out.println("Before Sorting");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		BubbleSorting(arr);
		System.out.println("After Sorting");
		
		for(int i = 0; i< arr.length ;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	public static void BubbleSorting(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n-i ; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]= temp;
				}
			}
		}
	}
}
