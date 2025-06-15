public class BankBCA extends Bank {
   public BankBCA() {
   }

   @Override
   public void sukuBunga() {
      System.out.println("Suku Bunga dari BCA adalah: 4.5%");
   }

   @Override
   public void transferUang(int var1, String var2, String var3) {
      System.out.println("Transfer Rp" + var1 + " ke rekening " + var2 + " di bank BCA");
   }
}
