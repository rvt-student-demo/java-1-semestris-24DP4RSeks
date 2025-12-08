package rvt;
public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private double affordablePrice = 2.50;
    private double heartilyPrice = 4.30;
    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        
        double change;
        if(payment >= affordablePrice){
            change = payment - affordablePrice;
            affordableMeals += 1;
            this.money = this.money + (payment - change);
            return change;
            
        }
        else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        
        double change;
        if(payment >= 4.30){
            change = payment - heartilyPrice;
            heartyMeals += 1;
            this.money = this.money + (payment - change);
            return change;
            
        }
        else{
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {

        boolean successful = card.takeMoney(affordablePrice);
        
        if(successful){
            this.affordableMeals += 1;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {

        boolean successful = card.takeMoney(heartilyPrice);
        
        if(successful){
            this.heartyMeals += 1;
            return true;
        }
        else{
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}