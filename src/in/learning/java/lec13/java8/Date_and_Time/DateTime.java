package in.learning.java.lec13.java8.Date_and_Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {

        // 1️⃣ Current Date and Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + now);

        // 2️⃣ Creating a Specific Date and Time
        LocalDateTime meeting = LocalDateTime.of(2025, Month.JULY, 24, 15, 30);
        System.out.println("Meeting DateTime: " + meeting);

        // 3️⃣ Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Formatted Current DateTime: " + formattedNow);

        // 4️⃣ Parsing DateTime from String
        String dateStr = "25-12-2024 10:00:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed DateTime: " + parsedDate);

        // 5️⃣ Adding and Subtracting Time
        LocalDateTime nextWeek = now.plusWeeks(1);
        LocalDateTime yesterday = now.minusDays(1);
        LocalDateTime nextHour = now.plusHours(1);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Next Hour: " + nextHour);

        // 6️⃣ Extracting Fields (Filtering)
        int year = now.getYear();
        int month = now.getMonthValue(); // or now.getMonth()
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
        System.out.println("Hour: " + hour + ", Minute: " + minute);

        // 7️⃣ Comparing DateTimes
        if (meeting.isAfter(now)) {
            System.out.println("Meeting is in the future.");
        } else if (meeting.isBefore(now)) {
            System.out.println("Meeting is in the past.");
        } else {
            System.out.println("Meeting is happening now.");
        }

        // 8️⃣ Difference Between Two DateTimes
        long daysBetween = ChronoUnit.DAYS.between(now, meeting);
        long hoursBetween = ChronoUnit.HOURS.between(now, meeting);
        System.out.println("Days until meeting: " + daysBetween);
        System.out.println("Hours until meeting: " + hoursBetween);

        // 9️⃣ Working with LocalDate and LocalTime
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Current Date only: " + date);
        System.out.println("Current Time only: " + time);

        // 🔟 Convert between Date and LocalDateTime (Legacy Compatibility)
        java.util.Date legacyDate = new java.util.Date();
        Instant instant = legacyDate.toInstant();
        LocalDateTime fromLegacy = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Converted from java.util.Date: " + fromLegacy);

        // ⏱️ Pause - Delaying for Demonstration (Optional)
        try {
            System.out.println("Sleeping 2 seconds...");
            Thread.sleep(2000); // 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 1️⃣1️⃣ Print again to show difference
        LocalDateTime afterSleep = LocalDateTime.now();
        System.out.println("Time after delay: " + afterSleep);
    }
}
