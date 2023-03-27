package com.portfolio.lau.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EducacionDto {
    
    @NotBlank
    private String establecimiento;
    
    @NotBlank
    private String logro;
    
    @NotBlank
    private String fecha;
    
    public EducacionDto() {
    }

    public EducacionDto(String establecimiento, String logro, String fecha) {
        this.establecimiento = establecimiento;
        this.logro = logro;
        this.fecha = fecha;
    }
    
}
