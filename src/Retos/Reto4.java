package Retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        double prima = 0;

        //Calcular prima según edad
        if (edad > 70) {
            prima = 500;
        } else if (edad >= 50) {
            prima = 400;
        } else if (edad >= 30) {
            prima = 250;
        } else {
            prima = 100;
        }

        // Calcular por ingresos
        if (ingresos >= 300) {
            prima = prima + (prima * 0.10);
        } else {
            prima = prima + (prima * 0.05);
        }
        System.out.println("La prima mensual es de : " + prima + " $");
    }
}
