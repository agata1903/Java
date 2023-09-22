package curso.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-09-21");
		LocalDate d05 = LocalDate.parse("21/09/2023", fmt1);
		
		
		System.out.println("Data de hoje: " + d01);
		System.out.println("Data e hora no horário de São Paulo: " + d02);
		System.out.println("Data e hora de Londres: " + d03);
		System.out.println("Data formatada: " + d04);
		System.out.println("Data personalizada: " + d05);
		
		
	}
}
