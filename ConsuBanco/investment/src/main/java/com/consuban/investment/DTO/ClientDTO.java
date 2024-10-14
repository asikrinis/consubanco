package com.consuban.investment.DTO;

public class ClientDTO {
    private String idClient;
    private String clientName;
    private String phoneNum;
    private String clientCol;

    // Getters y Setters
    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getClientCol() {
        return clientCol;
    }

    public void setClientCol(String clientCol) {
        this.clientCol = clientCol;
    }
}
