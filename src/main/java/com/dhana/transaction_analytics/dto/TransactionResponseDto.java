package com.dhana.transaction_analytics.dto;

import lombok.Data;
import lombok.Builder;

import java.math.BigInteger;

@Data
@Builder
public class TransactionResponseDto {

    private Long id;

    private String accountNumber;

    private BigInteger amount;

}
