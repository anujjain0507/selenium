package practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {

	public static void main(String[] args) throws Exception {
		String s = "31/12/2017";
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
		System.out.println(date);

	}

}
