package com.consuban.investment.Objetos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Isr",schema = "targetSchemaName")

public class Isr {

    @Id
    @Column(name="idIsr",unique = true,nullable = true)
    private String idIsr;

    @Column(name="rate",unique = false,nullable = false)
    private float rate;

    @Column(name="factor",unique = false ,nullable = false)
    private int factor;

    @Column(name="annualBase",unique = false, nullable = false)
    private int annualBase;

}
