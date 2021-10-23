package com.generation;

import com.generation.uber.UberDriver;
import com.generation.uber.UberBlackDriver;

    public class Main {

        public static void main(String[] args) {
            UberDriver driver = new UberDriver();
            UberBlackDriver blackDriver = new UberBlackDriver();

            System.out.println("Uber");
            System.out.println(driver.calculatePrice(6));


            System.out.println("Uber Black Driver");
            System.out.println(driver.calculatePrice(6));

        }
    }

/*import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {



    public static void main(String[] args) {

        Ave ave = new Ave("petirrojo") {
            @Override
            public void respirar() {

            }
        };
        Ave ave2 = new Ave() {
            @Override
            public void respirar() {

            }
        };
       //ave.comunicarse();
       //ave.hacerNido();
       //ave.comer();

       System.out.println("--------------------------------------------");

       Perro lomito = new Perro ("pulgas");
       //lomito.jugar();
       //lomito.comer();


        //Las clases abstractas sirven para heredar
       Animal animales = new Animal();
    }
}*/




