package com.generation;

/*public class Main {

    public static void main(String[] args) {*/

	//REFACTORING
// Ejemplo Carlos. No está optimizado, pero por tiempos del ejercicio se hizo de esta manera

        import java.util.Scanner;

        class Main {
            public static void main(String[] args) {

                addition();
                subtraction();
                multiplication();
                division();
            }


            public static void addition() {
                Scanner console = new Scanner(System.in);
                System.out.print("Enter addition number 1  ");
                int num1 = console.nextInt();
                System.out.print("Enter addition number 2  ");
                int num2 = console.nextInt();
                int addition = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + addition);
                //console.close();
            }

            public static void subtraction() {
                Scanner console = new Scanner(System.in);
                System.out.print("Enter subtraction number 1  ");
                int num1 = console.nextInt();
                System.out.print("Enter subtraction number 2  ");
                int num2 = console.nextInt();
                int subtraction = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + subtraction);
                //console.close();
            }

            public static void multiplication() {
                Scanner console = new Scanner(System.in);
                System.out.print("Enter multiplication number 1  ");
                int num1 = console.nextInt();
                System.out.print("Enter multiplication number 2  ");
                int num2 = console.nextInt();
                int multiplication = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiplication);
                //console.close();
            }

            public static void division() {
                Scanner console = new Scanner(System.in);
                System.out.print("Enter division number 1  ");
                int num1 = console.nextInt();
                System.out.print("Enter division number 2  ");
                int num2 = console.nextInt();
                int division = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + division);
                console.close();
            }
        }

