package com.consuban.investment.Objetos;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Branch {
    @Id
    private Long idBranch; // Cambiado de String a Long
    private String branchName;
    private String address;

    @OneToMany(mappedBy = "branch")
    private Set<ClientHasBranch> clientBranches = new HashSet<>();

    // Getters y Setters
    public Long getIdBranch() { // Cambiado de String a Long
        return idBranch;
    }

    public void setIdBranch(Long idBranch) { // Cambiado de String a Long
        this.idBranch = idBranch;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
