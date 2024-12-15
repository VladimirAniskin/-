package com.example.decision.repository;

import com.example.decision.model.LoanDecision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDecisionRepository extends JpaRepository<LoanDecision, Long> {

}
