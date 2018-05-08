package array_Concept;

public class BubbleSort {
	
	static void bubbleSort(int[] arr){
		int n = arr.length;
		int temp=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <n-i; j++) {
				if (arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {11,15,41,54,25,12,84,65,24};
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
