package com.retailer.rewards.charter.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Rewards {
    private long customerId;
    private double lastMonthRewardPoints;
    private double lastSecondMonthRewardPoints;
    private double lastThirdMonthRewardPoints;
    private double totalRewards;
}
