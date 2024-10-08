package Conversion;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDate {

	public static void main(String[] args) {
		
		Timestamp t = new Timestamp(System.currentTimeMillis());
		Date d = new Date(t.getTime());
		System.out.println(d);
		
		Date d1 = t;
		System.out.println(d1);
	}

}
