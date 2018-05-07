package practise;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDate {

	public static void main(String[] args) {
		
//		We can convert Timestamp to Date in java using constructor of java.util.Date class.
		
		/*The constructor of Date class receives long value as an argument. 
		So, you need to convert Timestamp object into long value using getTime() method of java.sql.Timestamp class.*/
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date(ts.getTime());
		System.out.println(date);
		
		
		/*The Timestamp class extends Date class. So, you can directly assign instance of Timestamp class into Date. 
		In such case, output of Date object will be like Timestamp. 
		But, it is not suggested by Java Doc because you may loose the milliseconds or nanoseconds of data.*/
		
		Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		Date date1 = ts1;
		System.out.println(date1);

	}

}
