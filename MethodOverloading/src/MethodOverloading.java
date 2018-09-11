public class MethodOverloading {

   public static void main(String[] args) {
      int newScore = calculateScore("Tim", 500);
      System.out.println("New score is " + newScore);

      calculateScore(75);
      calculateScore();

      System.out.println( calcFeetAndInchesToCentimeters(3, 6));
      System.out.println( calcFeetAndInchesToCentimeters(0, 0));
      System.out.println( calcFeetAndInchesToCentimeters(-3, 12));
   }

   private static int calculateScore(String playerName, int score) {

      System.out.println("Player " + playerName + " scored " + score +
              " points.");
      return score * 1000;
   }

   private static int calculateScore(int score) {

      System.out.println("Unnamed player scored " + score + " points.");
      return score * 1000;
   }

   private static int calculateScore() {

      System.out.println("No player name, no player score");
      return 0;
   }

   private static double calcFeetAndInchesToCentimeters(double inches) {

      double feet;

      if (inches >= 0) {
         if (inches <= 12) {
            feet = 0;
         } else {
            feet = inches / 12;
            inches =
         }

         calcFeetAndInchesToCentimeters(0, (feet * 12));
      }
   }

   private static double calcFeetAndInchesToCentimeters(double feet,
                                                        double inches) {
      if ( (feet>=0) && ((inches>=0) && (inches<=12))) {
         return (inches + (feet * 12)) * 2.54;
      }

      return -1;
   }
}
