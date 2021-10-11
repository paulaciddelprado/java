package com.generation;

public class Main {

    public static void main(String[] args) {
	boolean X = true;
    boolean Y = false;
    boolean Z = true;

    System.out.println ( "a)" + ((X && Y) || (X && Z)));
        System.out.println ( "b)" + ((X || !Y) && (!X || Z)));
        System.out.println ( "c)" + (X || Y && Z ));
        System.out.println ( "d)" + (!(X || Y) && Z ));
        System.out.println ( "e)" + (X || Y || X && !Z && !Z));
        System.out.println ( "d)" + (!X || !Y || Z && X && !Y ));
    }
}





//Ejercicios: Si X, Y y Z son variables de tipo boolean con valores X - true, Y - false, Z - true, determina el valor de las siguientes expresiones lógicas:
// a) (X && Y) || (X && Z)
// b) (X || !Y) && (!X || Z)
// c) X || Y && Z
// d) !(X || Y) && Z
// e) X || Y || X && !Z && !Z
// f) !X || !Y || Z && X && !Y