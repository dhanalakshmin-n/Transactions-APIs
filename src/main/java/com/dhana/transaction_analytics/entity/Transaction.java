package com.dhana.transaction_analytics.entity;

import com.dhana.transaction_analytics.enums.TransactionStatus;
import com.dhana.transaction_analytics.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Table(name="transactions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private BigInteger amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;


}
