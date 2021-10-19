package com.generation.paquete1;

public class persona {

    // Modificador de acceso privado, sólo nos deja desde la misma clase
    private String nombre;
    private int edad;

    private void saludar () {
        System.out.println("Hola, soy "+ nombre + " tengo " + edad + " años de edad");
    }

}
