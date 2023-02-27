import java.math.BigDecimal;
import static java.math.BigDecimal.ZERO;
public class BankAccount {
     String name;
     BigDecimal balance;
     boolean hasOverdraft;


    public BankAccount() {
    }

    public BankAccount(String name) {
        this.name = name;
        this.hasOverdraft = false;
        this.balance = ZERO;
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    // this is encapsulation.We are uniting data and behaviour in one place
    public BigDecimal withdrawMoney(BigDecimal amount){
        if(balance.subtract(amount).compareTo(ZERO)>=0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }


}
