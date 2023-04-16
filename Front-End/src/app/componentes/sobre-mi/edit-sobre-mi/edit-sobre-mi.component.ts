import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Persona } from 'src/app/model/persona.model';
import { JsonService } from 'src/app/service/json.service';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-edit-sobre-mi',
  templateUrl: './edit-sobre-mi.component.html',
  styleUrls: ['./edit-sobre-mi.component.css']
})
export class EditSobreMiComponent {

  persona: Persona = null;
  datos : any = {};

  constructor(private personaService: PersonaService, private activatedRouter: ActivatedRoute, private router: Router, private jsonService: JsonService) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.personaService.detalle(id).subscribe(
      data => {
        this.persona = data;
      }, err => {
        alert("Error al modificar");
        this.router.navigate(['']);
      }
    );
    this.jsonService.obtenerDatos().subscribe(
      (data : any ) => {
      this.datos = data;
    },
    (error: any) => {
      console.log(error);
    }
    );  
  }

  onUpdate(){

  }

  uploadImagen(){
    
  }

  Cancel(){
    
  }

}
