package com.progmatic.miniprojekt.modell;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderSummary {
    @Id
    @GeneratedValue
    private Long id;

    private String foodOrders;

    private String drinkOrders;

    private double totalPrice;


    public OrderSummary() {
    }

    public OrderSummary(String foodOrders, String drinkOrders, double totalPrice) {
        this.foodOrders = foodOrders;
        this.drinkOrders = drinkOrders;
        this.totalPrice = totalPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFoodOrders() {
        return foodOrders;
    }

    public void setFoodOrders(String foodOrders) {
        this.foodOrders = foodOrders;
    }

    public String getDrinkOrders() {
        return drinkOrders;
    }

    public void setDrinkOrders(String drinkOrders) {
        this.drinkOrders = drinkOrders;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
