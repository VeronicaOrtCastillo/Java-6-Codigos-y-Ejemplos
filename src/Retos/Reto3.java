package Retos;

import java.util.Scanner;
import java.util.Random;

public class Reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Para número aleatorio
        Random random = new Random();
        // Genera número entre 1 y 10
        int numeroSecreto = random.nextInt(10) + 1;

        int intento = 0;

        System.out.println("Adivina el número del 1 al 10:");

        // Se repite mientras no adivine
        while (intento != numeroSecreto) {

            System.out.print("Ingresa un número: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es MAYOR");

            } else if (intento > numeroSecreto) {
                System.out.println("El número es MENOR");

            } else {
                System.out.println("¡CORRECTO! El número secreto es "+ numeroSecreto);
            }
        }
    }
}
