package com.example.decision.dto;
import com.example.decision.model.ClientInfo;
import com.example.decision.model.LoanDecision;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class RequestOnCreditDto {
    private Long id;
    private ClientInfo clientInfo;
    private LoanDecision loanDecision;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public LoanDecision getLoanDecision() {
        return loanDecision;
    }

    public void setLoanDecision(LoanDecision loanDecision) {
        this.loanDecision = loanDecision;
    }


}
