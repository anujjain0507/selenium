package string_concept;

import java.util.Scanner;

public class JavaSortNamesInAscendingOrder {

	public static void main(String[] args) {
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Name");
		int Num = sc.nextInt();
		sc.nextLine();
		
		String names[] = new String[Num];
		
		for(int i = 0;i<Num;i++) {

			System.out.println("Enter Name [ " + (i+1)+ " ]: ");
			names[i] = sc.nextLine();
		}
		for(int i = 0;i<5;i++) {
			for(int j = 1;j<5;j++) {
				if(names[j-1].compareTo(names[j])>0) {
					temp = names[j-1];
					names[j-1]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("\nSorted names are in Ascending Order: ");
		for(int i =0;i<Num;i++) {
			System.out.println(names[i]);
		}

	}

}
