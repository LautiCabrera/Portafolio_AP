import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion';
import { EducacionService } from 'src/app/service/educacion.service';
import { ModalesService } from 'src/app/service/modales.service';

@Component({
  selector: 'app-new-educacion',
  templateUrl: './new-educacion.component.html',
  styleUrls: ['./new-educacion.component.css']
})
export class NewEducacionComponent {


  nombre: string;
  descripcion: string;

  constructor(private educacion: EducacionService, private router: Router, private modalSS: ModalesService) { }

  ngOnInit(): void {
  }

  onCreate(): void{
    const educacion = new Educacion(this.nombre, this.descripcion);
    this.educacion.save(educacion).subscribe(
      data =>{
        alert("Educación añadida con éxito");
        this.router.navigate(['']);
      }, err =>{
        alert("Fallo al añadir educación");
        this.router.navigate(['']);
      }
    )
  }

  Cancel(){
    this.router.navigate([''])
  }  

  CloseModal(){
    this.modalSS.$modal.emit(false);
  }

}
