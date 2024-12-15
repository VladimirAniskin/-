package com.example.decision.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class LoanDecision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JsonIgnore
    private RequestOnCredit requestOnCredit;

    @Column(name = "final_decision")
    private Boolean finalDecision;

    @Column(name = "amount_of_credit")
    private Integer amountOfCredit;

    @Column(name = "monthly_payment")
    private Integer monthlyPayment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RequestOnCredit getRequestOnCredit() {
        return requestOnCredit;
    }

    public void setRequestOnCredit(RequestOnCredit requestOnCredit) {
        this.requestOnCredit = requestOnCredit;
    }

    public Boolean getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(Boolean finalDecision) {
        this.finalDecision = finalDecision;
    }

    public Integer getAmountOfCredit() {
        return amountOfCredit;
    }

    public void setAmountOfCredit(Integer amountOfCredit) {
        this.amountOfCredit = amountOfCredit;
    }

    public Integer getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Integer monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
