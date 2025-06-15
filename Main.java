public class Main {
    public static void main(String[] args) {
        // Kode testing Anda di sini
        Bank bankUmum = new Bank();
        BankBNI bankBNI = new BankBNI();
        BankBCA bankBCA = new BankBCA();
        
        System.out.println("=== Testing Method Overloading ===");
        bankUmum.transferUang(100000, "123456789");
        bankUmum.transferUang(200000, "987654321", "Mandiri");
        bankUmum.transferUang(300000, "567891234", "BRI", "Pembayaran tagihan");
        bankUmum.sukuBunga();
        
        System.out.println("\n=== Testing Method Overriding ===");
        bankBNI.sukuBunga();
        bankBCA.sukuBunga();
        
        bankBNI.transferUang(500000, "112233445", "BNI");
        bankBCA.transferUang(750000, "556677889", "BCA");
    }
}