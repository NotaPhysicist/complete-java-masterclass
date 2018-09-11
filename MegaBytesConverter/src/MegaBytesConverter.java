public class MegaBytesConverter {


   public static void printMegaBytesAndKiloBytes(int kilobytes) {

      final int MB_KB_CONVERSION_FACTOR = 1024;
      int convertedMB;
      int convertedKB;

      if (kilobytes >= 0) {
         convertedMB = kilobytes / MB_KB_CONVERSION_FACTOR;
         convertedKB = kilobytes % MB_KB_CONVERSION_FACTOR;
         System.out.printf("%d KB = %d MB and %d KB\n", kilobytes, convertedMB,
                 convertedKB);
      } else {
         System.out.printf("Invalid Value");
      }
   }

   public static void main(String[] args) {

      printMegaBytesAndKiloBytes(2050);
      printMegaBytesAndKiloBytes(3000);
      printMegaBytesAndKiloBytes(50);
      printMegaBytesAndKiloBytes(-25);

   }
}
