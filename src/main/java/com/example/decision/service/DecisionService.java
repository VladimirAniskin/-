package com.example.decision.service;

import com.example.decision.dto.RequestOnCreditDto;
import org.springframework.http.ResponseEntity;

public interface DecisionService {
    ResponseEntity<RequestOnCreditDto> makeDecision(RequestOnCreditDto dto);
}
