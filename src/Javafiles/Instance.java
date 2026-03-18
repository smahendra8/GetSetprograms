package Javafiles;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
 class Instance {
        public static void main(String[] args) {
            // --- Modern Java Time API (Recommended) ---

            // 1. Using LocalDateTime.now() to get current date and time
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            System.out.println("LocalDateTime now: " + localDateTimeNow);

            // 2. Using Instant.now() to get the current timestamp in UTC
            Instant instantNow = Instant.now();
            System.out.println("Instant now (UTC): " + instantNow);

            // 3. Obtaining a specific format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
            System.out.println("Formatted time: " + localDateTimeNow.format(formatter));

            // 4. Using a specific time zone
            LocalDateTime timeInCalcutta = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
            System.out.println("Time in Kolkata: " + timeInCalcutta.format(formatter));


            // --- Legacy Date Class (For comparison, less recommended) ---

            // 5. Creating an instance of java.util.Date using the 'new' keyword
            Date legacyDate = new Date();
            System.out.println("\nLegacy Date: " + legacyDate);
        }
    }

//for practice this program


