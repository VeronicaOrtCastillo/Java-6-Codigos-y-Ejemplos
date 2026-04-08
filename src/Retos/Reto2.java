package Retos;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");
        //Guarda lo ingresado por el usuario
        String palabra = sc.nextLine();

        String invertir = "";
        //Recorre la palabra desde el final hasta el inicio
        for (int i = palabra.length() - 1; i >= 0 ; i--) {
            //va agregando cada letra al reves
            invertir += palabra.charAt(i);
        }
        //Compara si la palabra es igual a la invertida
        if (palabra.equals(invertir)){
            System.out.println(palabra + " Es un PALINDROMO");
        } else {
            System.out.println(palabra + " No es PALINDROMO");
        }
    }
}
