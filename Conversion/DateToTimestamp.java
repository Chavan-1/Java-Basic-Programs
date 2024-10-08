package Conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestamp {

	public static void main(String[] args) {
		
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		System.out.println(t);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(t));

	}

}
