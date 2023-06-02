package com.retailer.rewards.charter.repository;

import com.retailer.rewards.charter.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
     Customer findByCustomerId(long customerId);

}
