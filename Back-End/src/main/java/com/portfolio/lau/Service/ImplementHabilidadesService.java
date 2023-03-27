package com.portfolio.lau.Service;

import com.portfolio.lau.Entity.Habilidades;
import com.portfolio.lau.Repository.iHabilidadesRepository;
import com.portfolio.lau.Interface.iHabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementHabilidadesService implements iHabilidadesService {
    
    @Autowired iHabilidadesRepository iHabilidadesRepository;
    
    @Override
    public List<Habilidades> getHabilidades() {
        List<Habilidades> habilidades = iHabilidadesRepository.findAll();
        return habilidades;
    }

    @Override
    public void saveHabilidades(Habilidades habilidades) {
       iHabilidadesRepository.save(habilidades);
    }

    @Override
    public void deleteHabilidades(int id) {
     iHabilidadesRepository.deleteById(id);
    }

    @Override
    public Habilidades findHabilidades(int id) {
       Habilidades habilidades= iHabilidadesRepository.findById(id).orElse(null);
       return habilidades;
    }
    
}
