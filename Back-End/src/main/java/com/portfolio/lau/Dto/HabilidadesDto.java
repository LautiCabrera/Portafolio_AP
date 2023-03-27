package com.portfolio.lau.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HabilidadesDto {
    
     @NotBlank
    private String nombre;
     
    @NotBlank
    private int progeso;
    
    @NotBlank
    private String imagen;

    public HabilidadesDto() {
    }

    public HabilidadesDto(String nombre, int progeso, String imagen) {
        this.nombre = nombre;
        this.progeso = progeso;
        this.imagen = imagen;
    }
    
}
