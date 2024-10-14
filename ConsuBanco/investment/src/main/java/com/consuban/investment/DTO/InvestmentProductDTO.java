package com.consuban.investment.DTO;

public class InvestmentProductDTO {
    private String idInvestmentProduct;
    private String productName;
    private Double interestRate;

    // Getters y Setters
    public String getIdInvestmentProduct() {
        return idInvestmentProduct;
    }

    public void setIdInvestmentProduct(String idInvestmentProduct) {
        this.idInvestmentProduct = idInvestmentProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
