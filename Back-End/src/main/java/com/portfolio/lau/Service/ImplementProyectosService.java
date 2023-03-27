package com.portfolio.lau.Service;

import com.portfolio.lau.Entity.Proyectos;
import com.portfolio.lau.Repository.iProyectosRepository;
import com.portfolio.lau.Interface.iProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementProyectosService implements iProyectosService {
    
    @Autowired iProyectosRepository iproyectosRepository;
    
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = iproyectosRepository.findAll();
        return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
       iproyectosRepository.save(proyectos);
    }

    @Override
    public void deleteProyectos(int id) {
     iproyectosRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(int id) {
       Proyectos proyectos= iproyectosRepository.findById(id).orElse(null);
       return proyectos;
    }
    
}
