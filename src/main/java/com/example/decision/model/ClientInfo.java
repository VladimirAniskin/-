package com.example.decision.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClientInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String patronymic;

    @Column(name = "series_passport")
    private String seriesPassport;

    @Column(name = "number_passport")
    private String numberPassport;

    @Column(name = "current_monthly_payment")
    private Integer currentMonthlyPayment;

    @Column(name = "current_monthly_salary")
    private Integer currentMonthlySalary;

    @Column(name = "current_zarplata")
    private Integer currentZarplata;
    //TODO: это - "хорошая кредитная история"

    @Column(name = "good_credit_history")
    private Boolean goodCreditHistory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSeriesPassport() {
        return seriesPassport;
    }

    public void setSeriesPassport(String seriesPassport) {
        this.seriesPassport = seriesPassport;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public Integer getCurrentMonthlyPayment() {
        return currentMonthlyPayment;
    }

    public void setCurrentMonthlyPayment(Integer currentMonthlyPayment) {
        this.currentMonthlyPayment = currentMonthlyPayment;
    }

    public Integer getCurrentMonthlySalary() {
        return currentMonthlySalary;
    }

    public void setCurrentMonthlySalary(Integer currentMonthlySalary) {
        this.currentMonthlySalary = currentMonthlySalary;
    }

    public Integer getCurrentZarplata() {
        return currentZarplata;
    }

    public void setCurrentZarplata(Integer currentZarplata) {
        this.currentZarplata = currentZarplata;
    }

    public Boolean getGoodCreditHistory() {
        return goodCreditHistory;
    }

    public void setGoodCreditHistory(Boolean goodCreditHistory) {
        this.goodCreditHistory = goodCreditHistory;
    }
}
