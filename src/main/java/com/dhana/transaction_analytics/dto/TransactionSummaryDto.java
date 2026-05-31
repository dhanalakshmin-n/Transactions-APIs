package com.dhana.transaction_analytics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;


@Data
@AllArgsConstructor
public class TransactionSummaryDto {

    private BigInteger totalCredit;

    private BigInteger totalDebit;

    private Long failedTransactions;
}
