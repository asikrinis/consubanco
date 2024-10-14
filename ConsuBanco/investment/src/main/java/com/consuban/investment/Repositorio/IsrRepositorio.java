package com.consuban.investment.Repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.consuban.investment.Objetos.Isr;

@Repository
public interface IsrRepositorio extends CrudRepository<Isr,String>{

    
}