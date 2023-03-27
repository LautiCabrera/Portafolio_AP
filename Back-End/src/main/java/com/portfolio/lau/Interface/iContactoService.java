package com.portfolio.lau.Interface;

import com.portfolio.lau.Entity.Contacto;
import java.util.List;

public interface iContactoService {
    
    public List<Contacto> getContacto();
    
    public void saveContacto(Contacto contacto);
    
    public void deleteContacto (int id);
    
    public Contacto findContacto(int id); 
    
}
