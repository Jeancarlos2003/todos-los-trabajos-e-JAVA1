package trabajos.clases1;
//Ejercicio 3: Conversor de Temperatura
//Escribe un programa que convierta la temperatura de grados Celsius a Fahrenheit y viceversa.
//Pide al usuario que ingrese la temperatura y la unidad (Celsius o Fahrenheit).

import java.util.Scanner;

public class Trabajo6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Ingrese la temperatura");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese la udidad de la temperatura , c es para comvertir de celcius a  Fahrenheit , f es para comvertir de  fahrenheit a celcius");
        String unidad = scanner.nextLine();


        if (unidad == ("c")) {
            System.out.println("la temperatura equivale a "+ ( num1 * 9/5 + 32) + "grados  Fahrenheit " );

            if (unidad == ("f")) {
                System.out.println("la temperatura equivale a " + ( num1 - 32 * 5 / 9) +" grados celcius " );


            } else {
                System.out.println("opcion no valida");
            }
        }



    }


}
