export class Persona {
    
    id: number;
    nombre: String;
    apellido: String;
    imagen: String;
    descripcion: String;

    constructor(nombre: String, apellido: String, imagen: String, descripcion: String){
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }
}