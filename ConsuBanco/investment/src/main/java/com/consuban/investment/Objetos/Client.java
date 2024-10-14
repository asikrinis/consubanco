package com.consuban.investment.Objetos;

import java.util.HashSet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Client")
@Getter
@Setter
public class Client {
    @Id
    private String idClient;
    private String clientName;
    private String phoneNum;
    private String clientCol;

    @OneToMany(mappedBy = "client")
    private Set<ClientHasBranch> clientBranches = new HashSet<>();

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
