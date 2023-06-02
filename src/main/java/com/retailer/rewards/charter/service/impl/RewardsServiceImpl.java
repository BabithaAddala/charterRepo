package com.retailer.rewards.charter.service.impl;

import com.retailer.rewards.charter.dto.Rewards;
import com.retailer.rewards.charter.entity.Transaction;
import com.retailer.rewards.charter.repository.TransactionRepository;
import com.retailer.rewards.charter.service.RewardsService;
import com.retailer.rewards.charter.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RewardsServiceImpl implements RewardsService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Rewards getRewardsByCustomerId(long customerId) {

        List<Transaction> lastMonthTransactions = transactionRepository.findAllByCustomerIdAndTransactionDateBetween
                (customerId, getDate(1).with(TemporalAdjusters.firstDayOfMonth()),
                        getDate(1).with(TemporalAdjusters.lastDayOfMonth()));
        List<Transaction> lastSecondMonthTransactions = transactionRepository.findAllByCustomerIdAndTransactionDateBetween
                (customerId, getDate(2).with(TemporalAdjusters.firstDayOfMonth()),
                        getDate(2).with(TemporalAdjusters.lastDayOfMonth()));
        List<Transaction> lastThirdMonthTransactions = transactionRepository.findAllByCustomerIdAndTransactionDateBetween
                (customerId, getDate(3).with(TemporalAdjusters.firstDayOfMonth()),
                        getDate(3).with(TemporalAdjusters.lastDayOfMonth()));

        double lastMonthRewardPoints = getRewardsPerMonth(lastMonthTransactions);
        double lastSecondMonthRewardPoints = getRewardsPerMonth(lastSecondMonthTransactions);
        double lastThirdMonthRewardPoints = getRewardsPerMonth(lastThirdMonthTransactions);

        Rewards customerRewards = Rewards.builder().customerId(customerId).lastMonthRewardPoints(lastMonthRewardPoints)
                .lastSecondMonthRewardPoints(lastSecondMonthRewardPoints)
                .lastThirdMonthRewardPoints(lastThirdMonthRewardPoints)
                .totalRewards(lastMonthRewardPoints + lastSecondMonthRewardPoints + lastThirdMonthRewardPoints).build();

        return customerRewards;
    }

    private LocalDate getDate(int num) {
        return LocalDate.now().minusMonths(num);
    }

    private double getRewardsPerMonth(List<Transaction> transactions) {
        return transactions.stream().map(transaction -> calculateRewards(transaction))
                .collect(Collectors.summingDouble(r -> r.doubleValue()));
    }

    private double calculateRewards(Transaction t) {
        if (t.getTransactionAmount() > Constants.firstRewardsLimit && t.getTransactionAmount() <= Constants.secondRewardsLimit) {
            return Math.round(t.getTransactionAmount() - Constants.firstRewardsLimit);
        } else if (t.getTransactionAmount() > Constants.secondRewardsLimit) {
            return Math.round(t.getTransactionAmount() - Constants.secondRewardsLimit) * 2
                    + (Constants.secondRewardsLimit - Constants.firstRewardsLimit);
        } else
            return 0.0;
    }

}
