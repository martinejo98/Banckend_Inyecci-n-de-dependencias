package com.example.Ejercicio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    //Se encuentra todo comentado por el apartado 3, descomentar todo para su funcionamiento

    /*
    @Autowired //esto es la inyección de dependencias
    Persona persona1;

    @Autowired
    Ciudad ciudad1;

    @Autowired
    ArrayList<Ciudad> listaCiudad;

    @GetMapping("/controlador2/getPersona")
    public String getPersona(){
        persona1.setEdad(persona1.getEdad()*2);
        return persona1.toString();
    }

    @GetMapping("/controlador2/getCiudad")  //llaammos al metodo que tine un@Bean en la clase principal que guarda en un ArrayList
    public String getCiudad(){
        StringBuilder sb = new StringBuilder();
        for (Ciudad c: listaCiudad){
            sb.append("Nombre ciudad: ");
            sb.append(c.getNombreCiudad());
            sb.append(", número de habitantes: ");
            sb.append(c.getNumeroHabitantes());
            sb.append("\n");
        }
        return sb+"";
    }

    */
}
