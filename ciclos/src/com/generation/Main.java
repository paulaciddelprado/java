package com.generation;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// bloque de código que se repite N cantidad de veces, depende de una condición
        //declaración de interrupción y continuación
        //do, do-while, for
// CICLO FOR

        /*for (contador = 0 ; contador < numero; contador ++) {
            código que se repite
        } */

        //SCANNER
        /*Scanner sc = new Scanner(System.in);
        System.out.println ("Ingresa un número");
        int numero = sc.nextInt();
        sc.close();

// Con CONTINUE se puede indicar que no se detenga el ciclo incluso si se encuentra una condicional no cumplida
        //CONTINUE sólo sirve con IF
        //Pasa a la siguiente iteracción sin terminar de ejecutar el código debajo

        for (int i = 1; i <=10; i ++) {
            if (i%2 == 0) {
                continue;
        }
            System.out.println (numero + "x" + i + "=" + (numero*i));
        }

//Con BREAK cortamos el ciclo
            /*if ( i == 8) {
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println ("Ingresa un número");
        int numero1 = 0;
                int numero2 = 1;
                int numero3= 1;
                        sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i ++) {
            System.out.println (numero3);
            numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;
        }*/

        //CICLO WHILE, mientras la condición se cumpla se va a repetir el código
        //while (condition) {
        //La diferencia entre for y while, es que for debe estar determinado, y while puede continuar

            //código
            /*Scanner sc = new Scanner (System.in);
            System.out.println("Adivina el número secreto. Ingresa un número");
            int numero = sc.nextInt();
            int numeroSecreto = 33;
            while (numero != numeroSecreto) {
                System.out.println("Adivina el número secreto. Ingresa un número");
                numero = sc.nextInt();
            }
            sc.close();
            System.out.println ("Yei! Adivinaste el número secreto");*/

            //CICLO DO WHILE
        //Éste ciclo primero hace y luego pregunta

       /* Scanner sc = new Scanner (System.in);
        int numero = 0;
        int numeroSecreto = 33;
        do {
            System.out.println("Adivina el número secreto. Ingresa un número:");
            numero = sc.nextInt();
        } while (numero != numeroSecreto);
        sc.close();
        System.out.println ("Yei! Adivinaste el número secreto");*/

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un número para determinar su número factorial:");
        int inicial = sc.nextInt();
        int factorial = 1;
        int i = 1;

        while ( inicial++);
        sc.close();

        System.out.println ("El número factorial de " + i + "es: " + factorial);
        }

    }

