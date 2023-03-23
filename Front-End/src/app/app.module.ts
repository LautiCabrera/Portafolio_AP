import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactoComponent } from './componentes/contacto/contacto.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { EducacionTrabajoComponent } from './componentes/educacion-trabajo/educacion-trabajo.component';
import { HabilidadesComponent } from './componentes/habilidades/habilidades.component';
import { SobreMiComponent } from './componentes/sobre-mi/sobre-mi.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { PiePaginaComponent } from './componentes/pie-pagina/pie-pagina.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './componentes/home/home.component';
import { LoginComponent } from './componentes/login/login.component';
import { FormsModule }   from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ContactoComponent,
    ProyectosComponent,
    EducacionTrabajoComponent,
    HabilidadesComponent,
    SobreMiComponent,
    EncabezadoComponent,
    PiePaginaComponent,
    HomeComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
