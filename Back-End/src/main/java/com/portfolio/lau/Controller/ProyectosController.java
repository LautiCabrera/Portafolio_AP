package com.portfolio.lau.Controller;

import com.portfolio.lau.Entity.Proyectos;
import com.portfolio.lau.Interface.iProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins="https://localhost:4200/")
public class ProyectosController {
    
    @Autowired
    iProyectosService iproyectosService;
    
    @GetMapping("/traer")
    public List<Proyectos>getProyecto(){
     return iproyectosService.getProyectos();   
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteProyectos (@PathVariable Integer id){
        iproyectosService.deleteProyectos(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Proyectos editProyectos(@PathVariable("id") Integer id,
                              @RequestBody Proyectos proyectos)
    {
        
        proyectos.setId(id);
    
    iproyectosService.saveProyectos(proyectos);
    return proyectos;
    }
    
    @GetMapping(path = {"/{id}"})
    public Proyectos findProyectos(@PathVariable("id")int id){
        return iproyectosService.findProyectos(id);
    }
    
}
