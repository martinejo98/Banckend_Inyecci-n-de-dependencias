package com.example.Ejercicio5;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Ciudad {
    private String nombreCiudad;
    private int numeroHabitantes;
    public String getNombreCiudad(){
        return nombreCiudad;
    }

    public int getNumeroHabitantes(){
        return numeroHabitantes;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return "Nombre de la ciudad='" + nombreCiudad +", número de habitantes: " + numeroHabitantes;
    }
}
