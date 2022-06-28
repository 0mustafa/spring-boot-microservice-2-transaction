package com.sha.springbootmicroservice2transaction.Repository;

import com.sha.springbootmicroservice2transaction.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByUserId(Long userId);
}
