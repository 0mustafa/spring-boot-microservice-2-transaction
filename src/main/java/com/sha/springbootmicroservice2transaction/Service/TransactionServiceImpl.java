package com.sha.springbootmicroservice2transaction.Service;

import com.sha.springbootmicroservice2transaction.Model.Transaction;
import com.sha.springbootmicroservice2transaction.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());
        return  transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransacion(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> findAllTransactionsOfUser(Long userId){
        return transactionRepository.findAllByUserId(userId);
    }
}
