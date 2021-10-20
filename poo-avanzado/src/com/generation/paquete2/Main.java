package com.generation.paquete2;

import com.generation.banco.Person;
//Los atributos van depsués de la clase

public class Main {
    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {


            System.out.println("Antes de hacer la división");

            try {
                division = numerador/denominador;
            } catch (NullPointerException ex) {
                System.out.println("NullPointer");
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                ex.getMessage();
                System.out.println("Exception");
                System.out.println(ex.getMessage());
            } finally  {
                System.out.println("Soy finally");
            }

            System.out.println("Después de hacer la división");
        }
    }


               /* Person person= new Person("Paula", 28, "10023456");
                System.out.println( "Name: " + person.name);
                System.out.println( "Age: "+ person.age);
                System.out.println( "Id: " +  person.id);

                person.setName("Paula");
                person.setAge(28);
                person.setId("10023456");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getId()); */




        /*CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Paula Cid del Prado");
        cuenta.setClave("ABC-100234");
        cuenta.setSaldo(1000);


        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();


        String name;

        Animal animal = new Animal ();
        animal.name = "Ave";


	persona persona = new persona ();
    persona.nombre = "Paula";
    persona.edad = 28;*/



