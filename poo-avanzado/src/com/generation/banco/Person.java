package com.generation.banco;

public class Person
{

    public String name;
    public int age;
    public String id;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }


    public Person(String name, int age, String id )
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//Para encapsular: volver los atributos privados y usar GET y SET

//Muestra los datos
//GET - devuelve datos
// VOID - no devuelve nada


/*public class CuentaBancaria {
    public String nombre;
    public String clave;
    public float saldo;



    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre() {
        return this.nombre;
    }

    public String getClave() {
        return this.clave;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            this.saldo = saldo;
        } else {
            this.saldo = saldo;
        }
    }

    public void mostrarSaldo(){
        System.out.println(this.saldo);
    }
}*/



