import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("özkan",
                BigDecimal.TEN,
                false);
        System.out.println(
                bankAccount.withdrawMoney(new BigDecimal("9.0")));
        System.out.println(bankAccount.balance);
        System.out.println();
        System.out.println(
                bankAccount.withdrawMoney(new BigDecimal("1.0")));
        System.out.println(bankAccount.balance);

        bankAccount.balance = new BigDecimal(100_000); // This is not good! There is no control here
        System.out.println(bankAccount.balance); // anybody can reach the ballance




    }
}