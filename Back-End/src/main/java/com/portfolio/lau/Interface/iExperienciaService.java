package com.portfolio.lau.Interface;

import com.portfolio.lau.Entity.Experiencia;
import java.util.List;

public interface iExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia experiencia);
    
    public void deleteExperiencia (int id);
    
    public Experiencia findExperiencia(int id);
    
}
