package com.dhana.transaction_analytics.controller;

import com.dhana.transaction_analytics.dto.TransactionRequestDto;
import com.dhana.transaction_analytics.dto.TransactionResponseDto;
import com.dhana.transaction_analytics.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
