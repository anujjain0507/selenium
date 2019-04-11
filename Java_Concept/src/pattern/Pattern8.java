package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= i + 1; j++) {
				int num = 0;
				if (i % 2 == 0) {
					num = j < i ? i + 1 : j + 2;
				} else {
					num = j == 0 ? i + 2 : i + 1;
				}
				System.out.print(num);
			}
			System.out.println();
		}

	}

}
