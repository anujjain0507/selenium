package practise;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestamp {

	public static void main(String[] args) {
		
		/*We can convert Date to Timestamp in java using constructor of java.sql.Timestamp class.

		The constructor of Timestamp class receives long value as an argument. 
		So you need to convert date into long value using getTime() method of java.util.Date class.

		You can also format the output of Timestamp using java.text.SimpleDateFormat class.*/
		
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		
//		You can format the Timestamp value using SimpleDateFormat class
		
		Date date1 = new Date();
		Timestamp ts1 = new Timestamp(date.getTime());
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
		System.out.println(formater.format(ts));

	}

}
