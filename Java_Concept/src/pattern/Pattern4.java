/*       1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
12345678910987654321*/

package pattern;

public class Pattern4 {

	public static void main(String[] args) {

		int odd = 1;
		int size = 10;
		int SpaceCount = size-1;
		
		for (int i = 1; i <= size; i++) {
			for(int j=1;j<= SpaceCount;j++) {
				System.out.print(" ");
			}
			int k = 0;
			for (int j = 1; j <= odd; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print("*");
			}
			System.out.println();
			odd = odd + 2;
			SpaceCount = SpaceCount-1;
		}
	}
}
