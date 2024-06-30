package trabajos.clases1;
//Ejercicio 10: Juego de Piedra, Papel o Tijeras
//Implementa un juego simple de Piedra, Papel o Tijeras. Permite al usuario jugar contra
//la computadora y muestra el resultado.*/

import java.util.Random;
import java.util.Scanner;

public class Trabajo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra, papel, tijeras"};


        System.out.println("Ingrese piedra , papel o tijeras");
        String dato =  scanner.nextLine();

        int indiceComputadora = random.nextInt(3);

        String computadoraEleccion = opciones[indiceComputadora];



        System.out.println("Tu elección: " + dato);
        System.out.println("Elección de la computadora: " + computadoraEleccion);


        if (dato == (computadoraEleccion)) {
            System.out.println("¡Es un empate!");
        } else if ((dato==("piedra") && computadoraEleccion==("tijeras"))) {

        } else if  (dato==("papel") && computadoraEleccion==("piedra")) {

        } else if  (dato==("tijeras") && computadoraEleccion==("papel")) {
            System.out.println("¡Ganaste!");
        } else  System.out.println("¡la computadora gana!");




    }


}






