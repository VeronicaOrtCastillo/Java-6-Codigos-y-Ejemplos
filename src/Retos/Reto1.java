package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Permite crear un objeto para generar numeros aleatorios
        Random random = new Random();

        System.out.println("Ingresa el numero de participantes: ");
        int participantes = sc.nextInt();

        //Genera un numero aleatorio entre 1 y el ingresado por el usuario
        int ganador = random.nextInt(participantes) + 1;

        System.out.println("El numero ganador es: "+ ganador);
    }
}
