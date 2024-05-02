package org.cgmlti.dominios.java.Ejercicio2;

import java.util.ArrayList;
import  java.util.List;

public class Hospital {
    String nombre, direccion;
    Long telefono;


    //Lista de Medicos:
    //Tambien es un atributo de los objetos hospitales 
    List <Medico> listaMedicos = new ArrayList <Medico>();


    //Lista de salas:
    //Tambien es un atributo de los objetos hospitales 
    List <SalaHospital> ListaSala = new ArrayList <SalaHospital>();

}
