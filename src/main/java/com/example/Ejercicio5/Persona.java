package com.example.Ejercicio5;

import org.springframework.stereotype.Component;

@Component //esta etiqueta hace un NEW de Persona, la instancia automaticamente
public class Persona {
    protected String nombre;
    protected String poblacion;
    protected int edad;

    public Persona() {
    }

    public String getNombre(){
        return nombre;
    }

    public String getPoblacion(){
        return poblacion;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", población: "+poblacion+", edad: "+edad;
    }

}
