public class BarkingDog {

   public static boolean bark(boolean barking, int hourOfDay) {

      if (barking) {
         if (hourOfDay >= 0 && hourOfDay <= 23) {
            if (hourOfDay > 22 | hourOfDay < 8) {
               barking = true;
            } else {
               barking = false;
            }
         } else {
            barking = false;
         }
      } else {
         barking = false;
      }

      return barking;
   }

   public static void main(String[] args) {

      System.out.println(bark(true,1));
      System.out.println(bark(false, 2));
      System.out.println(bark(true, 8));
      System.out.println(bark(true, -1));
      System.out.println(bark(true, 24));
   }
}
