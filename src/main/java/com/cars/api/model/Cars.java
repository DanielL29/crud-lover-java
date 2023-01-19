package com.cars.api.model;

import lombok.Data;

import java.util.Date;

import com.cars.api.dto.CarsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data 
@Entity
public class Cars {

    public Cars() {}
    
    public Cars(CarsDTO cars) {
        this.modelo = cars.modelo();
        this.fabricante = cars.fabricante();
        this.dataFabricacao = cars.dataFabricacao();
        this.valor = cars.valor();
        this.anoModelo = cars.anoModelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String modelo;

    @Column(length = 200, nullable = false)
    private String fabricante;

    @Column(length = 200, nullable = false)
    private Date dataFabricacao;

    @Column(length = 200, nullable = false)
    private int valor;

    @Column(length = 200, nullable = false)
    private int anoModelo;
}
