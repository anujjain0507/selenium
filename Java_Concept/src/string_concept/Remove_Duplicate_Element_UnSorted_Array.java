package string_concept;

import java.util.HashSet;

public class Remove_Duplicate_Element_UnSorted_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 2, 8, 3, 4, 6, 5, 7 };
		
		HashSet<Integer> hasSet = new HashSet<Integer>();
		for(int i = 0;i<arr.length;i++) {
			hasSet.add(arr[i]);
		}
		for(int num :hasSet) {
			System.out.print(num+ " ");
		}
		
		
		

	}

}
