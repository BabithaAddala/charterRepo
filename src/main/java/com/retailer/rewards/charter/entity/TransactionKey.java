package com.retailer.rewards.charter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionKey implements Serializable {

    private long customerId;
    private long transactionId;
}
