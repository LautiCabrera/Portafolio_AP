package com.portfolio.lau.Controller;


import com.portfolio.lau.Entity.Educacion;
import com.portfolio.lau.Interface.iEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200/")
public class EducacionController {
    
     @Autowired
    iEducacionService ieducacionService;
    
    @GetMapping("/traer")
    public List<Educacion>getEducacion(){
     return ieducacionService.getEducacion();   
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteEducacion (@PathVariable Integer id){
        ieducacionService.deleteEducacion(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Educacion editEducacion(@PathVariable("id") Integer id, @RequestBody Educacion educacion)
    {
        
        educacion.setId(id);
    
    ieducacionService.saveEducacion(educacion);
    return educacion;
    }
    
    @GetMapping(path = {"/{id}"})
    public Educacion listarId(@PathVariable("id")int id){
        return ieducacionService.findEducacion(id);
    }
    
}
