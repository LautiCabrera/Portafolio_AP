import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})

export class EncabezadoComponent implements OnInit {
  
  isLogged = false;
  persona: Persona = new Persona("","","","");

  constructor(public personaService: PersonaService, private router: Router, private tokenService: TokenService) { }

  ngOnInit(): void {
    this.cargarPersona;
    if(this.tokenService.getToken()){
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }

  onLogOut():void{
    this.tokenService.logOut();
    window.location.reload();
  }

  login(){
    this.router.navigate(['/login'])
  }

  cargarPersona(){
    this.personaService.detail(1).subscribe(data => {this.persona = data});
  }
}
