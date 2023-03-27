package com.portfolio.lau.Service;

import com.portfolio.lau.Entity.Educacion;
import com.portfolio.lau.Repository.iEducacionRepository;
import com.portfolio.lau.Interface.iEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementEducacionService implements iEducacionService {
    
    @Autowired iEducacionRepository ieducacionRepository;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
       ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(int id) {
     ieducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(int id) {
       Educacion educacion= ieducacionRepository.findById(id).orElse(null);
       return educacion;
    }
    
}
