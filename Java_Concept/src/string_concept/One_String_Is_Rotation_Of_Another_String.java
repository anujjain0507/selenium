package string_concept;

public class One_String_Is_Rotation_Of_Another_String {

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		
		if(s1.length()!= s2.length()) {
			System.out.println("s2 is not roated version of s1");
		}
		else {
			String s3 = s1+s1;
			if(s3.contains(s2)) {
				System.out.println("S2 is rotated version of S1");
			}else {
				System.out.println("S2 is rotated version of S1");
			}
		}

	}

}
