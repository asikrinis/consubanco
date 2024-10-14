package com.consuban.investment.Repositorio;
import org.springframework.data.repository.CrudRepository;

import com.consuban.investment.Objetos.Branch;

public interface BranchRepository extends CrudRepository<Branch, String> {
    // Otros métodos personalizados si es necesario
}


