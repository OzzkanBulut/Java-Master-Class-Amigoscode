import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("özkan",new BigDecimal("100.0"));
        account.setBalance(150);
        System.out.println(account.getBalance());
    }
}