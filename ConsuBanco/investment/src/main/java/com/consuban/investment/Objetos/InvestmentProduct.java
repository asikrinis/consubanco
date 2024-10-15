package com.consuban.investment.Objetos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="InvestmentProduct", schema="targetSchemaName")
public class InvestmentProduct {

    @Id
    @Column(name="idInvestmentProduct", unique=true, nullable=false)
    private String idInvestmentProduct;

    @Column(name="productName", nullable=false)
    private String productName;

    @Column(name="interestRate", nullable=false)
    private double interestRate;

    @ManyToOne
    @JoinColumn(name = "idIsr", nullable = false) // Definimos la columna para la relación con Isr
    private Isr isr;

}
