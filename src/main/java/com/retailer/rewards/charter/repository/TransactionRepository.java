package com.retailer.rewards.charter.repository;

import com.retailer.rewards.charter.entity.Transaction;
import com.retailer.rewards.charter.entity.TransactionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByCustomerIdAndTransactionDateBetween(long customerId, LocalDate transactionDate1, LocalDate transactionDate2);
}