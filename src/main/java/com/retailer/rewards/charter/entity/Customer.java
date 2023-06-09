package com.retailer.rewards.charter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private long customerId;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

}
