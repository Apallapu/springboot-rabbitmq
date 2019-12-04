package com.ankamma.spring.model;

import java.io.Serializable;

public class Ticket implements Serializable{
    private String ticketNumber;
    private String productId;
    private double amount;

    public Ticket() {
    }

    public Ticket(String ticketNumber, String productId, double amount) {
        this.ticketNumber = ticketNumber;
        this.productId = productId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", productId='" + productId + '\'' +
                ", amount=" + amount +
                '}';
    }

    
    public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}