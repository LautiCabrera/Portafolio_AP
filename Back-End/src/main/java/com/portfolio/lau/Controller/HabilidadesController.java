package com.portfolio.lau.Controller;

import com.portfolio.lau.Entity.Habilidades;
import com.portfolio.lau.Interface.iHabilidadesService;
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
@RequestMapping("/habilidades")
@CrossOrigin(origins="http://localhost:4200/")
public class HabilidadesController {
    
    @Autowired
    iHabilidadesService ihabilidadesService;
    
    @GetMapping("/traer")
    public List<Habilidades>getHabilidades(){
     return ihabilidadesService.getHabilidades();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createHabilidades(@RequestBody Habilidades habilidades){
        ihabilidadesService.saveHabilidades(habilidades);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteHabilidades (@PathVariable Integer id){
        ihabilidadesService.deleteHabilidades(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Habilidades editHabilidades(@PathVariable("id") Integer id,
                              @RequestBody Habilidades habilidades)
    {
        
        habilidades.setId(id);
    
    ihabilidadesService.saveHabilidades(habilidades);
    return habilidades;
    }
    
    @GetMapping(path = {"/{id}"})
    public Habilidades findHabilidades(@PathVariable("id")int id){
        return ihabilidadesService.findHabilidades(id);
    }
    
}
