package array_Concept;

public class BubbleSort {
	
	public static void main(String [] args) {
		int arr[] = {5,48,45,65,2,45,4,32,12};
		System.out.println("Before Sorting");
		for(int i = 0 ;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		bubleSort(arr);
		System.out.println("After Sorting");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void bubleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
//		for(int i = 0;i<n;i++) {
//			for(int j = 1;j<n-i;j++) {
//				if(arr[j]-arr[i] > arr[i]) {
//					arr[i]=arr[j];
//				}
//			}
//	}
	
}
}

