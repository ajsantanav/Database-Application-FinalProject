package edu.citytech.cst.s23370098.dto;

public class Taxes {
    public float amount;

    public Taxes()
    {

    }
    public Taxes(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Taxes{" +
                "amount=" + amount +
                '}';
    }
}
