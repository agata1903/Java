package curso.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataGlobalParaLocal {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2023-09-22");
		LocalDateTime d2 = LocalDateTime.parse("2023-09-22T10:55:34");
		Instant d3 = Instant.parse("2023-09-22T10:55:34Z");
		
		LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		
		System.out.println("d1 dia: " + d1.getDayOfMonth());
		System.out.println("d1 mês: " + d1.getMonthValue());
		System.out.println("d1 ano: " + d1.getYear());
	}
}
