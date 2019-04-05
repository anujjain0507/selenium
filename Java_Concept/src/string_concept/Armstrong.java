package string_concept;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int OriginalNumber = 0; int Reminder = 0;int Result =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		OriginalNumber = num;
		while(OriginalNumber!= 0) {
			Reminder = OriginalNumber%10;
			Result += OriginalNumber+Math.pow(Reminder, 3);
			OriginalNumber = OriginalNumber/10;
		}
		if(Result == num) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is Armstrong");
		}
		sc.close();
	}

}
