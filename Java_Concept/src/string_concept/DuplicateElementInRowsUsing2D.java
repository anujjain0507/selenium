package string_concept;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInRowsUsing2D {

	public static void main(String[] args) {
		int arrayValues[][] = { { 4, 67, 34, 90 }, { 9, 4, 11, 100 }, { 6, 12, 9, 4 }, { 78, 87, 4, 2 } };

		// A set to store expected duplicates
		Set<Integer> expectedDuplicate = new HashSet<Integer>();

		// To store next row elements
		Set<Integer> deleteRow = new HashSet<Integer>();

		boolean duplicate = true;

		// Iteration starts from here
		for (int i = 0; i < arrayValues.length; i++) {
			// This will work for if every row has different number of elements
			for (int j = 0; j < arrayValues[i].length; j++) {
				// Assuming elements of first row are duplicates
				if (i == 0) {
					expectedDuplicate.add(arrayValues[i][j]);
				} else {
					deleteRow.add(arrayValues[i][j]);
				}
			}
			
			// If not first row, add in another HashSet
			if (i != 0) {
				// Intersection of two sets
				expectedDuplicate.retainAll(deleteRow);
				// Emptying deleteRow
				deleteRow.clear();
				
				// Check if intersection makes expectedDuplicates size 0.
				if (expectedDuplicate.size() == 0) {
					duplicate = false;
					break;
				}
			}
		}

		if (duplicate)
			System.out.println("Duplicated elemets in all rows: " + expectedDuplicate);
		else {
			System.out.println("There is no duplicate elements.");
		}
	}

}
