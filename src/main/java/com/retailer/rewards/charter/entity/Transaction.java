package com.retailer.rewards.charter.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TRANSACTION")
@Data
@IdClass(TransactionKey.class)
public class Transaction {

    @Id
    @Column(name = "TRANSACTION_ID")
    private long transactionId;

    @Id
    @Column(name = "CUSTOMER_ID")
    private long customerId;

    @Column(name = "TRANSACTION_DATE")
    private LocalDate transactionDate;

    @Column(name = "AMOUNT")
    private double transactionAmount;
}