package com.consuban.investment.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.consuban.investment.Objetos.ClientHasBranch;
import com.consuban.investment.Objetos.ClientBranchId;

@Repository
public interface ClientHasBranchRepository extends JpaRepository<ClientHasBranch, ClientBranchId> {
}
