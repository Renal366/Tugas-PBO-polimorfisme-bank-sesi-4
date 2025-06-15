public class Bank {
   public Bank() {
   }

   public void transferUang(int var1, String var2) {
      System.out.println("Transfer Rp" + var1 + " ke rekening " + var2);
   }

   public void transferUang(int var1, String var2, String var3) {
      double var4 = this.hitungBiayaTransfer(var1, var3);
      System.out.println("Transfer Rp" + var1 + " ke rekening " + var2 + " di bank " + var3 + " dengan biaya transfer: Rp" + var4);
   }

   public void transferUang(int var1, String var2, String var3, String var4) {
      System.out.println("Transfer Rp" + var1 + " ke rekening " + var2 + " di bank " + var3 + " dengan berita: " + var4);
   }

   public void sukuBunga() {
      System.out.println("Suku Bunga standar adalah 3%");
   }

   public double hitungBiayaTransfer(int var1, String var2) {
      double var3;
      if (var2.equalsIgnoreCase("BNI")) {
         var3 = 2500.0;
      } else if (var2.equalsIgnoreCase("BCA")) {
         var3 = 3000.0;
      } else if (var2.equalsIgnoreCase("Mandiri")) {
         var3 = 2000.0;
      } else {
         var3 = 5000.0;
      }

      if (var1 > 1000000) {
         var3 += 1000.0;
      }

      return var3;
   }
}
 
