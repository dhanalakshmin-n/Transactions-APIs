package com.dhana.transaction_analytics.controller;

import com.dhana.transaction_analytics.dto.TransactionRequestDto;
import com.dhana.transaction_analytics.dto.TransactionResponseDto;
import com.dhana.transaction_analytics.dto.TransactionSummaryDto;
import com.dhana.transaction_analytics.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(
            TransactionService service){

        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TransactionResponseDto> save(
            @RequestBody TransactionRequestDto dto) {

        return ResponseEntity.ok(
                service.save(dto)
        );
    }

    @GetMapping("/summary")
    public ResponseEntity<TransactionSummaryDto>
    getSummary() {

        return ResponseEntity.ok(
                service.getSummary()
        );
    }
}
