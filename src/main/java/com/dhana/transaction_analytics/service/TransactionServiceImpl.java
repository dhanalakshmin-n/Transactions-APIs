package com.dhana.transaction_analytics.service;

import com.dhana.transaction_analytics.dto.*;
import com.dhana.transaction_analytics.entity.Transaction;
import org.springframework.stereotype.Service;
import com.dhana.transaction_analytics.repository.TransactionRepository;

@Service
public class TransactionServiceImpl
    implements TransactionService {

    private final TransactionRepository repository;

    public TransactionServiceImpl(
            TransactionRepository repository){
            this.repository = repository;
    }

    @Override
    public TransactionResponseDto save(TransactionRequestDto dto) {
        Transaction transaction = Transaction
                .builder()
                .accountNumber(dto.getAccountNumber())
                .amount(dto.getAmount())
                .type(dto.getType())
                .status(dto.getStatus())
                .build();

        Transaction saved = repository.save(transaction);

        return TransactionResponseDto
                .builder()
                .id(saved.getId())
                .accountNumber(saved.getAccountNumber())
                .amount(saved.getAmount())
                .build();
    }

}
