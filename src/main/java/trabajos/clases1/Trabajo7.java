package trabajos.clases1;
//Ejercicio 4: Manejo de Cadenas
//Crea un programa que acepte una cadena de texto y realice las siguientes operaciones:
//Muestra la longitud de la cadena.
//Convierte la cadena a mayúsculas.
//Convierte la cadena a minúsculas.
//Verifica si la cadena contiene la palabra "Java".

import java.util.Scanner;

public class Trabajo7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();


        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);


        String mayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);


        String minusculas = cadena.toLowerCase();
        System.out.println("Cadena en minúsculas: " + minusculas);


        boolean contieneJava = cadena.contains("Java");
        if (contieneJava) {
            System.out.println("La cadena contiene la palabra \"Java\".");
        } else {
            System.out.println("La cadena NO contiene la palabra \"Java\".");
        }

        scanner.close();

    }
}
