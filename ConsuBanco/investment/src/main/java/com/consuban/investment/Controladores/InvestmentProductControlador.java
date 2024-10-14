package com.consuban.investment.Controladores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consuban.investment.DTO.InvestmentProductDTO;
import com.consuban.investment.Objetos.InvestmentProduct;
import com.consuban.investment.Servicio.InvestmentProductService;

@RestController
@RequestMapping("/investmentProduct")
public class InvestmentProductControlador {

    @Autowired
    private InvestmentProductService investmentProductService;

    // Crear un nuevo producto de inversión
    @PostMapping("/saveInvestmentProduct")
    public ResponseEntity<InvestmentProductDTO> saveInvestmentProduct(@RequestBody InvestmentProductDTO investmentProductDTO) {
        InvestmentProduct investmentProduct = investmentProductService.convertToEntity(investmentProductDTO);
        InvestmentProduct savedInvestmentProduct = investmentProductService.saveInvestmentProduct(investmentProduct);
        return ResponseEntity.ok(investmentProductService.convertToDTO(savedInvestmentProduct));
    }

    // Actualizar un producto de inversión existente
    @PutMapping("/updateInvestmentProduct")
    public ResponseEntity<InvestmentProductDTO> updateInvestmentProduct(@RequestBody InvestmentProductDTO investmentProductDTO) {
        InvestmentProduct investmentProduct = investmentProductService.convertToEntity(investmentProductDTO);
        InvestmentProduct updatedInvestmentProduct = investmentProductService.updateInvestmentProduct(investmentProduct);
        return ResponseEntity.ok(investmentProductService.convertToDTO(updatedInvestmentProduct));
    }

    // Obtener un producto de inversión por su ID
    @GetMapping("/{investmentProductId}")
    public ResponseEntity<InvestmentProductDTO> getInvestmentProduct(@PathVariable String investmentProductId) {
        Optional<InvestmentProduct> investmentProduct = investmentProductService.getInvestmentProduct(investmentProductId);
        return investmentProduct.map(value -> ResponseEntity.ok(investmentProductService.convertToDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar un producto de inversión por su ID
    @DeleteMapping("/{investmentProductId}")
    public ResponseEntity<Void> deleteInvestmentProduct(@PathVariable String investmentProductId) {
        investmentProductService.deleteInvestmentProduct(investmentProductId);
        return ResponseEntity.ok().build();
    }

    // Obtener todos los productos de inversión
    @GetMapping("/all")
    public ResponseEntity<List<InvestmentProductDTO>> getAllInvestmentProducts() {
        List<InvestmentProduct> investmentProducts = investmentProductService.getAllInvestmentProducts();
        List<InvestmentProductDTO> investmentProductDTOs = investmentProducts.stream()
                                                                             .map(investmentProductService::convertToDTO)
                                                                             .collect(Collectors.toList());
        return ResponseEntity.ok(investmentProductDTOs);
    }
}
