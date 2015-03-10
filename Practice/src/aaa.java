import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//import java.sql.Date; 

import org.joda.time.DateTime;
import org.joda.time.format.*;

public class aaa {

	public static void main(String[] args) throws ParseException {
		Date javaDate = new SimpleDateFormat("yyyy-MM-dd").parse("1900-01-01");
		System.out.printf("%s,  %d\n", javaDate, javaDate.getTime());

		DateTime jodaDate1 = new DateTime(1900, 1, 1, 0, 0, 0);
		System.out.printf("%s, %d\n", jodaDate1, jodaDate1.getMillis());

		DateTime jodaDate2 = new DateTime(javaDate.getTime());
		System.out.printf("%s,  %d\n", jodaDate2, jodaDate2.getMillis());
	}

}
