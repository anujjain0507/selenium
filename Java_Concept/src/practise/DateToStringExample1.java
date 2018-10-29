package practise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample1 {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String stdDate = dateformat.format(date);
		System.out.println("After Conversion "+stdDate);
	
		

	}

}
