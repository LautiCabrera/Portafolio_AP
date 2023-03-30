import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-new-educacion',
  templateUrl: './new-educacion.component.html',
  styleUrls: ['./new-educacion.component.css']
})
export class NewEducacionComponent {

  nombre: string;
  descripcion: string;

  constructor(private educacion: EducacionService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void{
    const educacion = new Educacion(this.nombre, this.descripcion);
    this.educacion.save(educacion).subscribe(
      data =>{
        alert("Educación añadida con éxito");
        this.router.navigate(['']);
      }, err =>{
        alert("Falló al añadir educación");
        this.router.navigate(['']);
      }
    )
  }

  Cancel(){
    this.router.navigate([''])
  }  

}
