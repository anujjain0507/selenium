package array_Concept;

public class Average_Value {

	public static void main(String[] args) {
		float average=0;
		int number[] = {11,15,41,54,25,12,84,65,24};
		int sum =0;
		for (int i = 0; i < number.length; i++) {
			sum = sum+number[i];
			average = sum/number.length;
		}
		System.out.println("Average value of the array elements is : " + average);

	}

}
