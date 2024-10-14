package com.consuban.investment.DTO;

public class IsrDTO {
    private String idIsr;
    private float rate;
    private int factor;
    private int annualBase;

    // Getters y Setters
    public String getIdIsr() {
        return idIsr;
    }

    public void setIdIsr(String idIsr) {
        this.idIsr = idIsr;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
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
