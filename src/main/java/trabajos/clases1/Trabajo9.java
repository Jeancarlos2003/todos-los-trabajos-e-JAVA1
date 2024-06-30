package trabajos.clases1;
//Ejercicio 9: Ordenamiento de Números
// Crea un programa que permita al usuario ingresar una lista de números y luego los ordene de menor a mayor.

import java.util.Scanner;

public class Trabajo9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese tres numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("el primer numero es mayor");
        }
        else
        if (num2>num1 && num2>num3) {
            System.out.println("el segundo numero es mayor");
        }
        else
        if (num3>num1 && num3>num2) {
            System.out.println("el tercer numero es mayor");
        }














    }


}
