package curso.datahora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date hoje = new Date(); //Data atual
		
		Date y1 = data1.parse("26/10/2023");
		Date y2 = data2.parse("26/10/2023 11:42:12");
		
		System.out.println("Data de hoje: " + data1.format(hoje));
		System.out.println(data1.format(y1));
		System.out.println(y2);
	}
	
}
