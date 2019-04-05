package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i <= 3; i++) {
			for(int j = 0;j<=i;j++){
				odd = odd+1;
				System.out.print(odd+ " ");
			}
			System.out.println();
			

		}
		
	}

}
