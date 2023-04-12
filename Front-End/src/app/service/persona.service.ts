import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona.model';
import { environment } from 'src/environments/environments';

@Injectable({
  providedIn: 'root'
})

export class PersonaService { 
  
  constructor(private http: HttpClient) { }

  URL = environment.URL + 'personas/';

  public lista(): Observable<Persona[]>{
    return this.http.get<Persona[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Persona>{
    return this.http.get<Persona>(this.URL + `detalle/${id}`);
  }

  public update(id: number, persona: Persona): Observable<any>{
    return this.http.put<any>(this.URL + `actualizar/${id}`, persona);
  }

}
