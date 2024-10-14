package com.consuban.investment.Servicio;

import com.consuban.investment.DTO.InvestmentProductDTO;
import com.consuban.investment.Objetos.InvestmentProduct;
import com.consuban.investment.Repositorio.InvestmentProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class InvestmentProductService {

    @Autowired
    private InvestmentProductRepository investmentProductRepository;

    // Guardar un producto de inversión
    public InvestmentProduct saveInvestmentProduct(InvestmentProduct investmentProduct) {
        return investmentProductRepository.save(investmentProduct);
    }

    // Actualizar un producto de inversión existente
    public InvestmentProduct updateInvestmentProduct(InvestmentProduct investmentProduct) {
        return investmentProductRepository.save(investmentProduct);
    }

    // Obtener un producto de inversión por su ID
    public Optional<InvestmentProduct> getInvestmentProduct(String investmentProductId) {
        return investmentProductRepository.findById(investmentProductId);
    }

    // Eliminar un producto de inversión por su ID
    public void deleteInvestmentProduct(String investmentProductId) {
        investmentProductRepository.deleteById(investmentProductId);
    }

    // Obtener todos los productos de inversión
    public List<InvestmentProduct> getAllInvestmentProducts() {
        return StreamSupport.stream(investmentProductRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public InvestmentProduct convertToEntity(InvestmentProductDTO investmentProductDTO) {
        InvestmentProduct investmentProduct = new InvestmentProduct();
        investmentProduct.setIdInvestmentProduct(investmentProductDTO.getIdInvestmentProduct());
        investmentProduct.setProductName(investmentProductDTO.getProductName());
        investmentProduct.setInterestRate(investmentProductDTO.getInterestRate());
        return investmentProduct;
    }
    
    public InvestmentProductDTO convertToDTO(InvestmentProduct investmentProduct) {
        InvestmentProductDTO investmentProductDTO = new InvestmentProductDTO();
        investmentProductDTO.setIdInvestmentProduct(investmentProduct.getIdInvestmentProduct());
        investmentProductDTO.setProductName(investmentProduct.getProductName());
        investmentProductDTO.setInterestRate(investmentProduct.getInterestRate());
        return investmentProductDTO;
    }
}
