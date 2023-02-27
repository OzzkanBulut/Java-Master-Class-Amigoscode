import java.math.BigDecimal;
import static java.math.BigDecimal.ZERO;
public class BankAccount {
    private String name;
    private BigDecimal balance;
    private boolean hasOverdraft;

    // this is encapsulation.We are uniting data and behaviour in one place
    public BigDecimal withdrawMoney(BigDecimal amount){
        if(balance.subtract(amount).compareTo(ZERO)>=0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return ZERO;
    }


}
