package rvt;
public class PaymentCard {
    private double balance;
    private final double AFFORDABLE_PRICE = 2.60;
    private final double HEARTILY_PRICE = 4.60;
    private final double MAX_BALANCE = 150.0;

    public PaymentCard(double openingBalance) {
        if (openingBalance > MAX_BALANCE) {
            this.balance = MAX_BALANCE;
        } else {
            this.balance = openingBalance;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= AFFORDABLE_PRICE) {
            this.balance = this.balance - AFFORDABLE_PRICE;
        }
    }

    public void eatHeartily() {
        if (this.balance >= HEARTILY_PRICE) {
            this.balance = this.balance - HEARTILY_PRICE;
        }
    }

    public void addMoney(double amount) {
        
        if (amount < 0) {
            return;
        }

        
        this.balance = this.balance + amount;

        if (this.balance > MAX_BALANCE) {
            this.balance = MAX_BALANCE;
        }
    }
}