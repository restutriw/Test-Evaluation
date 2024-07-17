package com.project.LongRunningAPI.Models;

import lombok.Data;

@Data
public class TransactionModel {
    private String id;
    private String customerName;
    private double amount;

    // Constructor
    public TransactionModel(String id, String customerName, double amount) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
    }
}
