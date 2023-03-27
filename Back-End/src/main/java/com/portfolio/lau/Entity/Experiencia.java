package com.portfolio.lau.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size (min = 5, max = 20, message = "No se encuentra información para cargar")
    private String nombre;
    
    @NotNull
    @Size (min = 20, max = 300, message = "No se encuentra información para cargar")
    private String descripcion;
    
    @NotNull
    @Size (min = 5, max = 30, message = "No se encuentra información para cargar")
    private String fecha;
}
