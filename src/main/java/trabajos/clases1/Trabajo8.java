package trabajos.clases1;
//Ejercicio 5: Clase Estudiante
//Crea una clase Estudiante con propiedades como nombre, edad, y calificaciones. Implementa métodos para
//calcular el promedio de calificaciones y mostrar la información del estudiante.

import java.util.Scanner;

public class Trabajo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la calificacion 1 del estudiante: ");
        double calificacion1 = scanner.nextInt();

        System.out.print("Ingrese la calificacion 2 del estudiante: ");
        double calificacion2 = scanner.nextInt();


        System.out.print("Ingrese la calificacion 3 del estudiante: ");
        double calificacion3 = scanner.nextInt();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3 ;

        System.out.print("el estudiante " + nombre + " con edad " + edad + " años tiene un promedio de " + promedio );





    }




}
