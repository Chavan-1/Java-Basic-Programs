package Conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		String strDate = dateformat.format(date);
		System.out.println(strDate);
	}

}
