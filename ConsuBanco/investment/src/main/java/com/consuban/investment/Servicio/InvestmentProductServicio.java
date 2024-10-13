package com.consuban.investment.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consuban.investment.Objetos.InvestmentProduct;
import com.consuban.investment.Repositorio.InvestmentProductRepositorio;

@Service
public class InvestmentProductServicio {

    @Autowired
    InvestmentProductRepositorio investmentProductRepositorio;

    InvestmentProduct invesP = new InvestmentProduct();

    public InvestmentProduct saveInvestmentProduct(InvestmentProduct investmentProduct){        
        if(investmentProductRepositorio.existsById(investmentProduct.getIdProduct())){
            return invesP;
        }
        else{
            return investmentProductRepositorio.save(investmentProduct);
            
        }
    }

    public InvestmentProduct modificarInvestmentProduct(InvestmentProduct investmentProduct){
        if(investmentProductRepositorio.existsById(investmentProduct.getIdProduct())){
            return investmentProductRepositorio.save(investmentProduct);
        }else{
            return invesP;
        }
    }

    public void eliminarinvestmentProduct(String idProduct){
        investmentProductRepositorio.deleteById(idProduct);
    }


    
}
