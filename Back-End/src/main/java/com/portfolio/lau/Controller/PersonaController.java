package com.portfolio.lau.Controller;

import com.portfolio.lau.Entity.Persona;
import com.portfolio.lau.Interface.PersonaService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PersonaController {
    
    @Autowired PersonaService personaService;
    
    @GetMapping("personas/traer")
    public List <Persona> getPersona(){
        return personaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona persona){
        personaService.guardarPersona(persona);
        return "La persona se creo correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
        return "La persona se elimino con exito";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, @RequestParam ("Nombre") String nombreNuevo, @RequestParam ("Apellido") String apellidoNuevo, @RequestParam ("Imagen") String imagenNueva){
        Persona persona = personaService.buscarPersona(id);
        
        persona.setNombre(nombreNuevo);
        persona.setApellido(apellidoNuevo);
        persona.setImagen(imagenNueva);
        
        personaService.guardarPersona(persona);
        return persona;
  }
    
    @GetMapping("/personas/traer/perfil")
    public Persona buscarPersona(){
        return personaService.buscarPersona((long)1);
    }
}
