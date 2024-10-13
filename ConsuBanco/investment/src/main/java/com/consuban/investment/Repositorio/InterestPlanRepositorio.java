package com.consuban.investment.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.consuban.investment.Objetos.InterestPlan;

@Repository
public interface InterestPlanRepositorio extends JpaRepository<InterestPlan,String> {

    
}