package com.retailer.rewards.charter.service;

import com.retailer.rewards.charter.dto.Rewards;

public interface RewardsService {
    Rewards getRewardsByCustomerId(long customerId);
}
