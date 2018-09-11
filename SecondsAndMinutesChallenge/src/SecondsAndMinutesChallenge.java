/*

   Solution to Method Overloading challenge, Section 5, Video 37.

   Written by: Timothy Carter.
   Last updated: 11 September 2018

 */
public class SecondsAndMinutesChallenge {

   private static final String INVALID_VALUE_MESSAGE = "Invalid value";

   private static String getDurationString(int minutes, int seconds) {

      /* First, validate parameters */
      if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
         return INVALID_VALUE_MESSAGE;
      }

      /* If parameters validate, return the formatted string */
      int hours = minutes / 60;
      minutes = minutes - (hours * 60);

      return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
   }

   private static String getDurationString(int seconds) {

      if (seconds < 0) {
         return INVALID_VALUE_MESSAGE;
      }

      int minutes = seconds / 60;
      seconds = seconds - (minutes * 60);

      return getDurationString(minutes, seconds);
   }

   public static void main(String[] args) {

      int minutes = -110;
      int seconds= -5;
      String formatted1, formatted2;
      int i;

      for (i = 0; i < 10; i++) {
         formatted1 = String.format("%5d minutes, %2d seconds = ",
                 minutes, seconds);
         formatted2 = String.format("%5d seconds = ", (seconds + 500));
         System.out.println(formatted1 + getDurationString(minutes, seconds));
         System.out.println(formatted2 + getDurationString((seconds + 500)));
         minutes = minutes + 50;
         seconds = seconds + 5;
      }
   }
}
