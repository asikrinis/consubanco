package com.consuban.investment.Objetos;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Client_has_Branch")
public class ClientHasBranch implements Serializable {

    @EmbeddedId
    private ClientBranchId id;

    @ManyToOne
    @MapsId("clientId")
    @JoinColumn(name = "Client_idClient")
    private Client client;

    @ManyToOne
    @MapsId("branchId")
    @JoinColumn(name = "Branch_idBranch")
    private Branch branch;

    // Constructor vacío
    public ClientHasBranch() {}

    // Constructor con parámetros
    public ClientHasBranch(Client client, Branch branch) {
        this.client = client;
        this.branch = branch;
        this.id = new ClientBranchId(client.getIdClient(), branch.getIdBranch());
    }

    // Getters y Setters
    public ClientBranchId getId() {
        return id;
    }

    public void setId(ClientBranchId id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
