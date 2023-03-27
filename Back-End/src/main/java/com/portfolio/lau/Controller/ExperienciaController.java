package com.portfolio.lau.Controller;

import com.portfolio.lau.Entity.Experiencia;
import com.portfolio.lau.Interface.iExperienciaService;
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
@RequestMapping("/experiencias")
@CrossOrigin(origins="https://localhost:4200/")
public class ExperienciaController {
    
    @Autowired
    iExperienciaService iexperienciaService;
    
    @GetMapping("/traer")
    public List<Experiencia>getExperiencia(){
     return iexperienciaService.getExperiencia();   
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteExperiencia (@PathVariable Integer id){
        iexperienciaService.deleteExperiencia(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Experiencia editExperiencia(@PathVariable("id") Integer id,
                              @RequestBody Experiencia experiencia)
    {
        
        experiencia.setId(id);
    
    iexperienciaService.saveExperiencia(experiencia);
    return experiencia;
    }
    
    @GetMapping(path = {"/{id}"})
    public Experiencia findExperiencia(@PathVariable("id")int id){
        return iexperienciaService.findExperiencia(id);
    }
    
}
