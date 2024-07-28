package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JavaLocalDate {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-01-01");
		LocalDateTime d05 = LocalDateTime.parse("2024-04-07T18:14");
		Instant d06 = Instant.parse("2024-04-07T18:14:30Z");
		Instant d07 = Instant.parse("2024-04-07T18:14:30-03:00");
		
		DateTimeFormatter f01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2024", f01);
		
		DateTimeFormatter f02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2024 13:00", f02);
		
		LocalDate d10 = LocalDate.of(2024, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2024, 07, 02, 14, 12);
		
		DateTimeFormatter f03 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String d12 = LocalDate.now().format(f03);
		String d13 = f03.format(LocalDateTime.now());
		
		DateTimeFormatter f04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Z"));
		String d14 = f04.format(Instant.now());
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		System.out.println(d14);
	}
}

/**
 * ## Padrão ISO 8601 para Date&Time

- Data-[hora] local:
    - 2022-07-21
    - 2022-07-21T14:52
    - 2022-07-21T14:52:09
    - 2022-07-21T14:52:09.4073
- Data-hora global:
    - 2022-07-23T14:52:09Z
    - 2022-07-23T14:52:09.254935Z
    - 2022-07-23T14:52:09-03:00
 */