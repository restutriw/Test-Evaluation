package com.project.LongRunningAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.LongRunningAPI.Models.TransactionModel;
import com.project.LongRunningAPI.Services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<TransactionModel>> getAllTransactions() {
        List<TransactionModel> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }
}
