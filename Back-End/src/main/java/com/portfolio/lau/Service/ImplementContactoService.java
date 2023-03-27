package com.portfolio.lau.Service;

import com.portfolio.lau.Entity.Contacto;
import com.portfolio.lau.Repository.iContactoRepository;
import com.portfolio.lau.Interface.iContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementContactoService implements iContactoService {
    
    @Autowired iContactoRepository icontactoRepository;
    
 @Override
    public List<Contacto> getContacto() {
        List<Contacto> contacto = icontactoRepository.findAll();
        return contacto;
    }

 @Override
    public void saveContacto(Contacto contacto) {
       icontactoRepository.save(contacto);
    }

  @Override
    public void deleteContacto(int id) {
     icontactoRepository.deleteById(id);
    }

 @Override
    public Contacto findContacto(int id) {
       Contacto contacto= icontactoRepository.findById(id).orElse(null);
       return contacto;
    }
    
}
