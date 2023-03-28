import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Experiencia } from '../model/experiencia';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {

  URL = 'https://localhost:8080/explab'

  constructor(private http: HttpClient) { }

  getExperiencia() {
    return this.http.get<Experiencia[]>(this.URL + '/traer');
  }
  createExperiencia(experiencia: Experiencia) {
    return this.http.post<Experiencia>(this.URL + '/crear', experiencia);
  }
  getExperienciaId(id: number) {
    return this.http.get<Experiencia>(this.URL + "/" + id);
  }
  updateExperiencia(experiencia: Experiencia) {
    return this.http.put<Experiencia>(this.URL + "/editar/" + experiencia.id, experiencia);
  }
  deleteExperiencia(experiencia: Experiencia) {
    return this.http.delete<Experiencia>(this.URL + "/borrar/" + experiencia.id);
  }
  
}
