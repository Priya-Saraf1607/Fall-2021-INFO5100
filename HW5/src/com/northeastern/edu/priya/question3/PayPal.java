package com.northeastern.edu.priya.question3;

public class PayPal implements PaymentStrategy{
    String email;

    PayPal(String email){
        this.email = email;
    }

    public void pay(int payment){
        System.out.println("PayPal: $" + payment);
    }
}
