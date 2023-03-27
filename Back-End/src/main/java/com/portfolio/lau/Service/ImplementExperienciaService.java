package com.portfolio.lau.Service;

import com.portfolio.lau.Entity.Experiencia;
import com.portfolio.lau.Repository.iExperienciaRepository;
import com.portfolio.lau.Interface.iExperienciaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImplementExperienciaService implements iExperienciaService {
    
     @Autowired iExperienciaRepository iexperienciaRepository;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
       iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(int id) {
     iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(int id) {
       Experiencia experiencia= iexperienciaRepository.findById(id).orElse(null);
       return experiencia;
    }
    
}
