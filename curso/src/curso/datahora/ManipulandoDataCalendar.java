package curso.datahora;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDataCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = new Date();
		
		System.out.println(data1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_MONTH, 4);
		d = cal.getTime();
		
		System.out.println(data1.format(d));
		
	}
}
