
public class BankBNI extends Bank {
   public BankBNI() {
   }

   @Override
   public void sukuBunga() {
      System.out.println("Suku Bunga dari BNI adalah: 4%");
   }

   @Override
   public void transferUang(int var1, String var2, String var3) {
      System.out.println("Transfer Rp" + var1 + " ke rekening " + var2 + " di bank BNI");
   }
}
