package com.generation;

public class perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    /*public perro ();

    public perro (String nombre) {
        this.nombre = nombre;
    }

    public perro (String nombre, String raza, int edad, String tamanio); {
        this.nombre = nombre;
        this.raza = raza; */

    public perro (String nombre, String raza, int edad, String tamanio); {
        this.nombre = nombre;
        this.raza = raza;
        this.edad= edad;
        this.tamanio = tamanio;
    }


    public void caracteristicas () {
        System.out.println ("Hola, mi nombre es " + this.nombre + ", soy de raza " +
                this.raza + " tengo " + this.edad + " años. Soy de tamaño " + this.tamanio);
    }

    public void comer () {
        System.out.println ("Estoy comiendo");
    }
    public void jugar () {
        System.out.println ("Estoy jugando");
    }
    public void dormir () {
        System.out.println ("Estoy durmiendo");
    }
}


