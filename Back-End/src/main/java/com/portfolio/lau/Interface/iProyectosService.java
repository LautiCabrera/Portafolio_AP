package com.portfolio.lau.Interface;

import com.portfolio.lau.Entity.Proyectos;
import java.util.List;

public interface iProyectosService {
    
    public List<Proyectos> getProyectos();
    
    public void saveProyectos(Proyectos proyectos);
    
    public void deleteProyectos (int id);
    
    public Proyectos findProyectos(int id);
    
}
