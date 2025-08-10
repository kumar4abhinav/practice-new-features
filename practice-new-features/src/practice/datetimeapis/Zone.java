package practice.datetimeapis;

//Java code for Zoned date-time API
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {

//Function to get Zoned Date and Time
	public static void ZonedTimeAndDate() {
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedCurrentDate = date.format(format1);

		System.out.println("formatted current Date and" + " Time : " + formattedCurrentDate);

		// to get the current zone
		ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
		System.out.println("the current zoned date time is " + currentZonedDateTime.getZone());

		// getting time zone of specific place
		// we use withZoneSameInstant(): it is
		// used to return a copy of this date-time
		// with a different time-zone,
		// retaining the instant.
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");

		ZonedDateTime tokyoZone = currentZonedDateTime.withZoneSameInstant(tokyo);

		System.out.println("tokyo time zone is " + tokyoZone);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = tokyoZone.format(format);

		System.out.println("formatted tokyo time zone " + formatedDateTime);

	}

	// Driver code
	public static void main(String[] args) {

		ZonedTimeAndDate();

	}
}