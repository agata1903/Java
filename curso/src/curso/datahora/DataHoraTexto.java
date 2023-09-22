package curso.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraTexto {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2023-09-22");
		LocalDateTime d2 = LocalDateTime.parse("2023-09-22T10:55:34");
		Instant d3 = Instant.parse("2023-09-22T10:55:34Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d1: " + d1.format(fmt1));
		System.out.println("d2: " + d2.format(fmt2));
		System.out.println("d3: " + fmt3.format(d3));
	}
}
