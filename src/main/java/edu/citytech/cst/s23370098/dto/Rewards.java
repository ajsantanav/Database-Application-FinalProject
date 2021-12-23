package edu.citytech.cst.s23370098.dto;

public class Rewards {

    private float amount;
    private ShortDate date;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public ShortDate getDate() {
        return date;
    }

    public void setDate(ShortDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Rewards{" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }
}
