import java.math.BigDecimal;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private boolean hasOverdraft;

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }
    public void withDraw(int amount){
        if(this.balance.compareTo(new BigDecimal(amount))>=0){
            this.balance = this.balance.subtract(new BigDecimal(amount));
        }
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = BigDecimal.valueOf(balance);
    }


}
