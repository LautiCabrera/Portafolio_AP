package com.portfolio.lau.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDto {
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String apellido;
    
    @NotBlank
    private String titulo;
    
    @NotBlank
    private String hobbie;
    
    @NotBlank
    private String img;

    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String titulo, String hobbie, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.hobbie = hobbie;
        this.img = img;
    }
    
}
