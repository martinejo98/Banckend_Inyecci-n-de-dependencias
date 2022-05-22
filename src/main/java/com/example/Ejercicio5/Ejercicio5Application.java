package com.example.Ejercicio5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Ejercicio5Application {

	public static void main(String[] args) {

		SpringApplication.run(Ejercicio5Application.class, args);
	}

	/*
	@Bean
	public ArrayList<Ciudad> listaCiudad(){
		ArrayList<Ciudad> lista = new ArrayList<>();
		return lista;
	}
	*/

	///////////////////////////////Apartado 3///////////////////////////////////////////

	@Bean("bean1")
	@Qualifier("bean1")
	public Persona pers1(){
		Persona pers1 = new Persona();
		pers1.setNombre("bean1");
		return pers1;
	}

	@Bean("bean2")
	@Qualifier("bean2")
	public Persona pers2(){
		Persona pers2 = new Persona();
		pers2.setNombre("bean2");
		return pers2;
	}

	@Bean("bean3")
	@Qualifier("bean3")
	public Persona pers3(){
		Persona pers3 = new Persona();
		pers3.setNombre("bean3");
		return pers3;
	}
}
