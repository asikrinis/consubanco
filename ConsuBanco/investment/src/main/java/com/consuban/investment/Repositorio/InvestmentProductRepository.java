package com.consuban.investment.Repositorio;

import org.springframework.data.repository.CrudRepository;
import com.consuban.investment.Objetos.InvestmentProduct;

public interface InvestmentProductRepository extends CrudRepository<InvestmentProduct, String> {
}
