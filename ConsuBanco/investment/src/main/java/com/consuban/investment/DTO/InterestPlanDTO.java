package com.consuban.investment.DTO;

public class InterestPlanDTO {
    private String idInterestPlan;
    private int amount;
    private double rate;
    private int factor;
    private int annualBase;

    // Getters y Setters
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
