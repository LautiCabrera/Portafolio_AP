package com.portfolio.lau.Interface;

import com.portfolio.lau.Entity.Persona;
import java.util.List;

public interface PersonaService {
    
    public List <Persona> getPersona();
    
    public void guardarPersona (Persona persona);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
}
