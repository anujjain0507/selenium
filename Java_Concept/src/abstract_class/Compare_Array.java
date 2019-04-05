package abstract_class;

public class Compare_Array {

	public static void main(String[] args) {
		int a[] = {1,4,5,3,5,7};
		int b [] = {1,5,4,3,7,9} ;
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+ " ");
				}
			}
		}
 
	}

}
