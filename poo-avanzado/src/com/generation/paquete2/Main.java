package com.generation.paquete2;

import com.generation.banco.Person;

public class Main {

    public static void main(String[] args) {

                Person person= new Person("Paula", 28, "10023456");
                /*System.out.println( "Name: " + person.name);
                System.out.println( "Age: "+ person.age);
                System.out.println( "Id: " +  person.id);*/

                person.setName("Paula");
                person.setAge(28);
                person.setId("10023456");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getId());

            }
        }

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



