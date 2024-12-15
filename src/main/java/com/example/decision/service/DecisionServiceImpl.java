package com.example.decision.service;

import com.example.decision.dto.RequestOnCreditDto;
import com.example.decision.model.LoanDecision;
import com.example.decision.repository.LoanDecisionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DecisionServiceImpl implements DecisionService {
    LoanDecisionRepository loanDecisionRepository;
    @Override
    public ResponseEntity<RequestOnCreditDto> makeDecision(RequestOnCreditDto dto) {
        LoanDecision loanDecision = new LoanDecision();
        loanDecision.setFinalDecision(dto.getClientInfo().getGoodCreditHistory());
        loanDecision.setAmountOfCredit(100000);
        loanDecision.setMonthlyPayment(10000);
        loanDecision = loanDecisionRepository.save(loanDecision);
        dto.setLoanDecision(loanDecision);
        return ResponseEntity.ok(dto);
    }
}
