package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// En JS los arreglos podían contener objetos, strings, números, etc. pero en JAVA no, se deben definir
        //qué tipo de elementos tendremos

        //Arreglo declarado en multilinea:

        /*String universidades[];
        universidades = new String [5];
        universidades [0] = "ITVH";
        universidades [1] = "ULA";
        universidades [2] = "UAM";
        universidades [3] = "UADM";
        universidades [4] = "UNAM";
        /*universidades [5] = "UPN";
        universidades [6] = "IPN";
        universidades [7] = "TESCO";

        //Arreglo declarado en una sola linea
        //Con valores inicializados
        String universidades[] = new String[0];
        String[] strings = {"ITVH", "ULA", "UAM", "UADM", "UNAM"};

        for (String universidad: universidades) {
System.out.println(universidades);
        }*/
/*
        Set<String> frutas = new HashSet();
        //Características principales de Set
        //No puede contener ekementos duplicados
        //El orden de los elemento puede variar
        //Solo almacena

        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Papaya");
        frutas.add("Lima");

        for (String fruta: frutas) {
            System.out.println(fruta);
        }
        System.out.println("-------TreeSet------"); }


//Ordena alfabéticamente
        Set<String> frutas2 = new TreeSet();
        frutas2.add ("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Papaya");
        frutas2.add("Lima");

        for (String frutas2: fruta) {
            System.out.println(frutas2);
        }

        System.out.println("------LinkedHashSet-------");
    Set<String> frutas3 = new LinkedHashSet<>(4);

    //Ordena en orden de inserción
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Papaya");
        frutas3.add("Lima");

        for (String fruta: frutas3) {
            System.out.println(fruta);
                }

        System.out.println("-------Paula------");

final Set hashSet = new HashSet(1_000_000);
final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
        hashSet.add(i);
        }
final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

final Set treeSet = new TreeSet();
final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
        treeSet.add(i);
        }
final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

final Set linkedHashSet = new LinkedHashSet(1_000_000);
final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
        linkedHashSet.add(i);
        }
final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime)); */

        System.out.println("-------ArrayList------");
        List<String> frutas = new ArrayList<>();

        //List sí admite elementos duplicados

        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Papaya");
        frutas.add("Lima");

        for (String fruta: frutas) {
            System.out.println(fruta);
        }

        System.out.println("-------Elementos ArrayList------");
        System.out.println(frutas.get(3));
        int indice =frutas.indexOf("Fresa");
        System.out.println(frutas.get(indice));




        System.out.println("-------LinkedList------");
        List<String> frutas2 = new LinkedList<>();
        //LinkedList - lista doblemente enlazada, el elemento sabe qué va antes y qué va después
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Papaya");
        frutas2.add("Lima");

        for (String fruta: frutas2); {
            System.out.println(frutas2);
        }


        System.out.println("-------MAP------");

        Map<Integer, String> universidades = new HashMap <Integer, String>();
        // HASHMAP Asocia claves con valores
        // No puede tener claves repetidas
        //Sólo puede tener un valor asociado a la clave
        //Se les llama diccionarios a este tipo de colección

        universidades.put(1, "UNAM");
        universidades.put(2, "IPN");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(5, "TESCO");
        universidades.put(6, "UAG");

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }
        System.out.println(universidades.get(1));


    }
    }

