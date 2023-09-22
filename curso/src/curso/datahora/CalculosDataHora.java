package curso.datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2023-09-22");
		LocalDateTime d2 = LocalDateTime.parse("2023-09-22T10:55:34");
		Instant d3 = Instant.parse("2023-09-22T10:55:34Z");
		
		LocalDate semanaAnteriorLocal = d1.minusDays(7);
		LocalDate proximaSemanaLocal = d1.plusDays(7);
		
		System.out.println(semanaAnteriorLocal);
		System.out.println(proximaSemanaLocal);
		
		LocalDateTime semanaAnteriorHoraLocal = d2.minusDays(7);
		LocalDateTime proximaSemanaHoraLocal = d2.plusDays(7);
		
		System.out.println(semanaAnteriorHoraLocal);
		System.out.println(proximaSemanaHoraLocal);
		
		Instant semanaPassadaInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d3.minus(7, ChronoUnit.DAYS);
		
		System.out.println(semanaPassadaInstant);
		System.out.println(proximaSemanaInstant);
		
		Duration t1 = Duration.between(semanaAnteriorHoraLocal, d2);
		System.out.println(t1.toDays());
	}
}
