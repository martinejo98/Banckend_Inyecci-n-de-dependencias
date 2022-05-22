package com.example.Ejercicio5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controlador1 {

  /*
  @Autowired // esta etiqueta me crea el objeto de clase persona (cuando hemos puesto @Component en
  Persona persona1;     // esa clase). ESTO ES LA INYECCIÓN DE DEPENDENCIAS

  @Autowired Ciudad ciudad1;
  @Autowired ArrayList<Ciudad> listaCiudad;


  @GetMapping("/controlador1/addPersona/{nombre}/{poblacion}/{edad}") // le establezco la URL y le digo que es de tipo GET
  public String getPersona(@PathVariable String nombre, @PathVariable String poblacion, @PathVariable int edad) {
    persona1.setNombre(nombre);
    persona1.setPoblacion(poblacion);
    persona1.setEdad(edad);
    return "";
  }

  @PostMapping("/controlador1/addCiudad")
  @RequestMapping(
      value = "/controlador1/addCiudad",
      method = RequestMethod.POST,
      consumes = "application/json")
  public void addCiudad(@RequestBody Ciudad ciudad1) {
    listaCiudad.add(
        ciudad1); // creamos un @Bean en la clase main que guarde en un ArrayList las ciudad y aquí
                  // le llamamod
  }
  */


  ////////////////////////////////////////////////Apartado 3//////////////////////////////////////////////////////
  @Autowired
  @Qualifier("bean1")
  Persona pers1;

  @Autowired
  @Qualifier("bean2")
  Persona pers2;

  @Autowired
  @Qualifier("bean3")
  Persona pers3;

  @GetMapping("/controlador1/bean/{bean}")
  public String getBean(@PathVariable String bean) {
    switch (bean){
      case "bean1":
        return pers1.getNombre();
      case "bean2":
        return pers2.getNombre();
      case "bean3":
        return pers3.getNombre();
    }
    return "Nombre de @Bean inválido";
  }

}
