package com.consuban.investment.Repositorio;

import com.consuban.investment.Objetos.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {
    // Métodos personalizados si es necesario
}
