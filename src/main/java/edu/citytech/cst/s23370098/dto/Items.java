package edu.citytech.cst.s23370098.dto;

public class Items
{
    private float unitPrice;

    private int quantity;

    private String name;

    private float totalCost;

    public float getUnitPrice ()
    {
        return unitPrice;
    }

    public void setUnitPrice (float unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public int getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public float getTotalCost ()
    {
        return totalCost;
    }

    public void setTotalCost (float totalCost)
    {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Items{" +
                "unitPrice='" + unitPrice + '\'' +
                ", quantity='" + quantity + '\'' +
                ", name='" + name + '\'' +
                ", totalCost='" + totalCost + '\'' +
                '}';
    }

}