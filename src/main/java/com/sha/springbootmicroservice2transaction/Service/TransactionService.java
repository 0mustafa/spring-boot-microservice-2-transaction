package com.sha.springbootmicroservice2transaction.Service;

import com.sha.springbootmicroservice2transaction.Model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransacion(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
