package in.learning.java.lec14Calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderClass {
    public static void main(String[] args) {
        /*
         * === Java Calendar Class Notes & Examples ===
         * 
         * 1. Calendar is an abstract class in java.util package.
         * 2. It provides methods to get and manipulate date and time fields.
         * 3. GregorianCalendar is the default concrete implementation of Calendar.
         * 4. Months are zero-based: January = 0, December = 11.
         * 5. Calendar instances are mutable: methods like add() modify the same object.
         */
        
        // Get a Calendar instance representing current date and time
        Calendar cal = Calendar.getInstance();
        System.out.println("Class used internally: " + cal.getClass());
        
        // Print current date and time
        System.out.println("Current Date & Time: " + cal.getTime());
        
        // Extract individual date/time fields
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // Add 1 because MONTH is zero-based
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY); // 24-hour clock
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        
        System.out.println("Year: " + year);
        System.out.println("Month: " + month + " (Note: January=1)");
        System.out.println("Day: " + day);
        System.out.println("Hour (24h): " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        
        // Adding time: add 5 days to current date
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date After 5 Days: " + cal.getTime());
        
        // Subtract 1 month from the updated date
        cal.add(Calendar.MONTH, -1);
        System.out.println("Date One Month Ago (from above date): " + cal.getTime());
        
        // Setting a specific date/time manually
        Calendar birthday = new GregorianCalendar(1990, Calendar.DECEMBER, 15, 10, 30, 0);
        System.out.println("Birthday: " + birthday.getTime());
        
        // Comparing dates: check if birthday is before current date
        boolean isBefore = birthday.before(cal);
        System.out.println("Is birthday before 'cal' date? " + isBefore);
        
        // Reset 'cal' to current date/time again (since it was mutated)
        cal = Calendar.getInstance();
        
        // Demonstrate roll() - rolls the DAY_OF_MONTH without changing larger fields
        System.out.println("Current Date: " + cal.getTime());
        cal.roll(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After rolling DAY_OF_MONTH by 10: " + cal.getTime());
        
        /*
         * Important notes:
         * - add() method changes larger fields if needed (e.g., adding days that push month)
         * - roll() only changes the specified field without affecting larger fields.
         */
    }
}
