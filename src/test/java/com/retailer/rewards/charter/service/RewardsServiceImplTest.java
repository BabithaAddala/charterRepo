package com.retailer.rewards.charter.service;

import com.retailer.rewards.charter.dto.Rewards;
import com.retailer.rewards.charter.entity.Transaction;
import com.retailer.rewards.charter.repository.TransactionRepository;
import com.retailer.rewards.charter.service.impl.RewardsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Collections;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class RewardsServiceImplTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private RewardsServiceImpl rewardsService;

    @Test
    public void testGetRewardsByCustomerId() {

       /* LocalDate lastMonth = LocalDate.now().minusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastSecondMonth = LocalDate.now().minusMonths(2).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastThirdMonth = LocalDate.now().minusMonths(3).with(TemporalAdjusters.firstDayOfMonth());
        Timestamp timestamp1 = Timestamp.valueOf(lastMonth.atTime(LocalTime.MIDNIGHT));
        Timestamp timestamp2 = Timestamp.valueOf(lastMonth.atTime(LocalTime.MIDNIGHT));
        Timestamp timestamp3 = Timestamp.valueOf(lastMonth.atTime(LocalTime.MIDNIGHT));

        Transaction transaction3 = new Transaction();
        transaction3.setCustomerId(1001L);
        transaction3.setTransactionId(3L);
        transaction3.setTransactionDate(timestamp1);
        transaction3.setTransactionAmount(120);

        Transaction transaction2 = new Transaction();
        transaction2.setCustomerId(1001L);
        transaction2.setTransactionId(2L);
        transaction2.setTransactionDate(timestamp2);
        transaction2.setTransactionAmount(75);

        Transaction transaction1 = new Transaction();
        transaction1.setCustomerId(1001L);
        transaction1.setTransactionId(1L);
        transaction1.setTransactionDate(timestamp3);
        transaction1.setTransactionAmount(140);



        when(transactionRepository.findAllByCustomerIdAndTransactionDate
                (1001L, Timestamp.valueOf(lastMonth.atTime(LocalTime.MIDNIGHT))))
                .thenReturn(Collections.singletonList(transaction1));

        when(transactionRepository.findAllByCustomerIdAndTransactionDate
                (1001L, Timestamp.valueOf(lastSecondMonth.atTime(LocalTime.MIDNIGHT))))
                .thenReturn(Collections.singletonList(transaction2));

        when(transactionRepository.findAllByCustomerIdAndTransactionDate
                (1001L, Timestamp.valueOf(lastThirdMonth.atTime(LocalTime.MIDNIGHT))))
                .thenReturn(Collections.singletonList(transaction3));

        Rewards response = rewardsService.getRewardsByCustomerId(1001L);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(1001, response.getCustomerId());
        Assertions.assertEquals(245, response.getTotalRewards());

        */
    }
}
