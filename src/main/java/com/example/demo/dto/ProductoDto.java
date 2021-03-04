package com.example.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductoDto {
    @NotBlank
    private String nombre;
    @Min(0)
    private Float precio;

    public ProductoDto() {

    }

    public ProductoDto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getPrecio() {
        return precio;
    }
}
