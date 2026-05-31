package com.dhana.transaction_analytics.service;
import com.dhana.transaction_analytics.dto.*;

public interface TransactionService {
    TransactionResponseDto save(
            TransactionRequestDto dto);

    TransactionSummaryDto getSummary();
}
