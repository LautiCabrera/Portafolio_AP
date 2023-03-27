package com.portfolio.lau.Interface;

import com.portfolio.lau.Entity.Habilidades;
import java.util.List;

public interface iHabilidadesService {
    
    public List<Habilidades> getHabilidades();
    
    public void saveHabilidades(Habilidades habilidades);
    
    public void deleteHabilidades(int id);
    
    public Habilidades findHabilidades(int id);
    
}
