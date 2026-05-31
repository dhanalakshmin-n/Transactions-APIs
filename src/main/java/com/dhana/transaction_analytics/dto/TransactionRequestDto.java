package com.dhana.transaction_analytics.dto;

import com.dhana.transaction_analytics.enums.TransactionStatus;
import com.dhana.transaction_analytics.enums.TransactionType;
import lombok.Data;
import java.math.BigInteger;

@Data
public class TransactionRequestDto {

    private String accountNumber;

    private BigInteger amount;

    private TransactionType type;

    private TransactionStatus status;
}
