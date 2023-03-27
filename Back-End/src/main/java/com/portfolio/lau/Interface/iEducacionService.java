package com.portfolio.lau.Interface;

import com.portfolio.lau.Entity.Educacion;
import java.util.List;

public interface iEducacionService {
    
    public List<Educacion> getEducacion();
    
    public void saveEducacion (Educacion educacion);
    
    public void deleteEducacion (int id);
    
    public Educacion findEducacion(int id);
    
}
