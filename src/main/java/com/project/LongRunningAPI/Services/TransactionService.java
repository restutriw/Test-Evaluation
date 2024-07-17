package com.project.LongRunningAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.project.LongRunningAPI.Models.TransactionModel;

@Service
public class TransactionService {

    public static List<TransactionModel> dataTransactions() {
        List<TransactionModel> transactions = new ArrayList<>();

        // Menambahkan beberapa transaksi dummy ke dalam list
        transactions.add(new TransactionModel("TRX001", "John Doe", 100.0));
        transactions.add(new TransactionModel("TRX002", "Jane Smith", 150.0));
        transactions.add(new TransactionModel("TRX003", "Michael Johnson", 200.0));
        transactions.add(new TransactionModel("TRX004", "Emily Brown", 120.0));

        return transactions;
    }

    @Async
    public CompletableFuture<List<TransactionModel>> getAllTransactionsAsync() {
        try {
            Thread.sleep(5 * 60 * 1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture(dataTransactions());
    }

    public List<TransactionModel> getAllTransactions() {
        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dataTransactions();
    }
}
