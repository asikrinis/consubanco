package com.consuban.investment.Objetos;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private Long idClient; 

    @Column(name = "clientName", nullable = false)
    private String clientName;

    @Column(name = "phoneNum")
    private String phoneNum;

    @Column(name = "clientCol")
    private String clientCol;

    // Constructor sin parámetros
    public Client() {}

    // Constructor con parámetros
    public Client(String clientName, String phoneNum, String clientCol) {
        this.clientName = clientName;
        this.phoneNum = phoneNum;
        this.clientCol = clientCol;
    }

    // Getters y Setters
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
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