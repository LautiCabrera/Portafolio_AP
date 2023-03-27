package com.portfolio.lau.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExperienciaDto {
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String puesto;
    
    @NotBlank
    private String fecha;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombre, String puesto, String fecha) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.fecha = fecha;
    }
    
}
