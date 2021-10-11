package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Estructura de control If
        /*if (condición) {
        } else if () {
        } else {
        }
        */
// nextIn los convierte a un entero
        // System.out.println es para un Front
        //sc.nextLine() nos ayuda a limpiar los valores
        // sc.close() para cerrar el scanner, una vez cerrado ya no se puede volver a abrir, se necesita poner el código antes

//Scanner sc = new Scanner (System.in);
        //System.out.println ("Ingresa tu edad");
        //int edad =sc.nextInt ();
        //System.out.println ("¿Cuál es tu nombre?");
        //sc.nextLine();
        //String nombre = sc.nextLine();
        //if (edad > 18) {
        //     System.out.println ("Felicidades, "+ nombre + " puedes votar");
        // } else {
        //     System.out.println ("Aún no puedes votar, " + nombre);
        // }


        //Scanner sc = new Scanner (System.in);
        //System.out.println ("Ingresa un primer valor de angulo");
        //int a = sc.nextInt ();
        //sc.nextLine();
        //System.out.println ("Ingresa un segundo valor de angulo");
        //int b = sc.nextInt ();
        //sc.nextLine();
        //System.out.println ("Ingresa un tercer valor de angulo");
        //int c = sc.nextInt ();
        //sc.nextLine ();

        //int suma = a + b + c;
        //sc.nextInt ();
        //if (suma == 180) {
        //System.out.println ("Es un triángulo");
        //} else {
        //  System.out.println ("No es un triángulo");

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año");
        int a = sc.nextInt();
        int div = a % 4;

        sc.nextLine();
        if (div % 4 == 0) {
            if (div % 100 == 0) {
                if (div % 400 == 0) {
                    System.out.println("Es un año bisiesto");
                } else {
                    System.out.println("No es un año bisiesto");
                }
            }
        }

        sc.close();
    }
}*/

//Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo es válido

//Scanner sc = new Scanner (System.in);
//System.out.println ("Ingresa un primer valor de ángulo");



//Pedir un año al usuario por consola y determinar si el año es bisiesto

//Control de flujo SWITCH
/*switch (condicion) {
    case 1:
        codigo
                break;
    case 2:
        codigo
                break;
        break;
        default;
        break;*/

        // La diagonal invertida indica que salta a la siguiente línea

       /* Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un número");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro número");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada: \n1) Suma \n2) Resta" +
                "\n3) Multiplicacion \n4) Division");
        int operacion = sc.nextInt();
        sc.nextLine();
float resultado = 0;

        switch (operacion) {
            case 1:
            resultado = numero1 + numero2;
            break;
            case 2:
            resultado = numero1 - numero2;
            break;
            case 3:
            resultado = numero1 * numero2;
            break;
            case 4:
            resultado = numero1 / numero2;
            break;
            default:
                System.out.println ("La operación que seleccionaste es inválida");
                break;
        }
       // sc.close(); */

        // Pedir un número al usuario y dependiendo la respuesta
        // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        // Si elige un numero fuera de ese rango mostar un mensaje de error;


        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un número del 1 al 7");
        int day1 = sc.nextInt();
        int day2 = sc.nextInt();
        int day3 = sc.nextInt();
        int day4 = sc.nextInt();
        int day5 = sc.nextInt();
        int day6 = sc.nextInt();
        int day7 = sc.nextInt();
        int select = sc.nextLine();
        sc.nextLine();

        switch (select) {
            day1 = "Lunes";
            break;
            day2 = "Martes";
            break;
            day3 = "Miércoles";
            break;
            day4 = "Jueves";
            break;
            day5 = "Viernes";
            break;
            day6 = "Sábado";
            break;
            day7 = "Domingo";
            break;
            default -> System.out.println("El día que seleccionaste es el ");



    }
}

