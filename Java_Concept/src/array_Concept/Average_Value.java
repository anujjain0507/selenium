package array_Concept;

public class Average_Value {

	public static void main(String[] args) {
		float average=0;
		int number[] = {11,15,41,54,25,12,84,65,24};
		int size = number.length;
		int sum =0;
		for (int i = 0; i <size; i++) {
			sum = sum+number[i];
			average = sum/size;
		}
		System.out.println("Average value of the array elements is : " + average);

	}

}
