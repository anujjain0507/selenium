package array_Concept;

public class Average_Value {

	public static void main(String[] args) {
		int number[] = {11,15,41,54,25,12,84,65,24};
		int length = number.length;
		int sum = 0;
		for(int i = 0;i<length;i++) {
			sum = sum + number[i];
			
		}
		float average = sum/length;
		System.out.println("Average value of the array elements is : "+ average);
	}

}
