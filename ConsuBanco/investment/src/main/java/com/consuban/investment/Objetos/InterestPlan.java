package com.consuban.investment.Objetos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "InterestPlan")
@Getter
@Setter
public class InterestPlan {

    @Id
    private String idInterestPlan;
    private int amount;
    private double rate;
    private int factor;
    private int annualBase;

    // Getters y Setters adicionales si no usas Lombok
    public String getIdInterestPlan() {
        return idInterestPlan;
    }

    public void setIdInterestPlan(String idInterestPlan) {
        this.idInterestPlan = idInterestPlan;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getAnnualBase() {
        return annualBase;
    }

    public void setAnnualBase(int annualBase) {
        this.annualBase = annualBase;
    }
}
