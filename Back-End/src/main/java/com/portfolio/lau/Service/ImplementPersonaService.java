
package com.portfolio.lau.Service;

import com.portfolio.lau.Entity.Persona;
import com.portfolio.lau.Interface.PersonaService;
import com.portfolio.lau.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementPersonaService implements PersonaService {

    @Autowired PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = personaRepository.findAll();
        return persona;
    }

    @Override
    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
