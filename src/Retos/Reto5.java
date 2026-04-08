package Retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Datos iniciales
        double saldo = 1000; // Saldo inicial
        int opcion; // Variable para guardar la opción del menú

        // Pedir usuario y contraseña
        System.out.print("Ingresa tu usuario: ");
        String usuario = sc.nextLine(); // Guarda el usuario

        System.out.print("Ingresa tu contraseña: ");
        String contrasena = sc.nextLine(); // Guarda la contraseña

        //Menú repetitivo hasta que elija salir
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Consultar últimos movimientos");
            System.out.println("5. Convertir divisas");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // Muestra saldo
                    System.out.println("Tu saldo es: $" + saldo);
                    break;

                case 2:
                    // Ingresa dinero
                    System.out.print("¿Cuánto deseas ingresar?: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito; // Suma al saldo
                    System.out.println("Nuevo saldo: $" + saldo);
                    break;

                case 3:
                    //Retirar dinero
                    System.out.print("¿Cuánto deseas retirar?: ");
                    double retiro = sc.nextDouble();

                    if (retiro <= saldo) { // Validar que tenga dinero suficiente
                        saldo -= retiro; // Resta al saldo
                        System.out.println("Retiro exitoso. Saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes");
                    }
                    break;

                case 4:
                    //Simulación de movimientos
                    System.out.println("Últimos movimientos: (simulación)");
                    System.out.println("Depósito: +$500");
                    System.out.println("Retiro: -$200");
                    break;

                case 5:
                    //CONVERSOR DE DIVISAS
                    System.out.println("\n--- CONVERSOR ---");
                    System.out.println("1. MXN a USD");
                    System.out.println("2. MXN a EUR");
                    System.out.println("3. USD a MXN");
                    System.out.println("4. EUR a MXN");
                    System.out.println("5. USD a EUR");
                    System.out.println("6. EUR a USD");

                    System.out.print("Elige tipo de conversión: ");
                    int tipo = sc.nextInt(); // Tipo de conversión

                    System.out.print("Ingresa cantidad: ");
                    double cantidad = sc.nextDouble(); // Cantidad a convertir

                    double resultado = 0; // Resultado de conversión

                    //Tasas
                    double usd = 17.0; // 1 USD = 17 MXN
                    double eur = 18.5; // 1 EUR = 18.5 MXN

                    switch (tipo) {

                        case 1:
                            resultado = cantidad / usd; // MXN → USD
                            System.out.println("Resultado: " + resultado + " USD");
                            break;

                        case 2:
                            resultado = cantidad / eur; // MXN → EUR
                            System.out.println("Resultado: " + resultado + " EUR");
                            break;

                        case 3:
                            resultado = cantidad * usd; // USD → MXN
                            System.out.println("Resultado: " + resultado + " MXN");
                            break;

                        case 4:
                            resultado = cantidad * eur; // EUR → MXN
                            System.out.println("Resultado: " + resultado + " MXN");
                            break;

                        case 5:
                            resultado = (cantidad * usd) / eur; // USD → EUR
                            System.out.println("Resultado: " + resultado + " EUR");
                            break;

                        case 6:
                            resultado = (cantidad * eur) / usd; // EUR → USD
                            System.out.println("Resultado: " + resultado + " USD");
                            break;

                        default:
                            System.out.println("Opción inválida");
                    }
                    break;

                case 0:
                    //Salir del programa
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    //Opción incorrecta
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0); // Se repite hasta que elija salir
    }
}
