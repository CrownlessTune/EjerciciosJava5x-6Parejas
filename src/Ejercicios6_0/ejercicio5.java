package Ejercicios6_0;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número de dígitos en " + numero + " es: " + cantidadDigitos);

        scanner.close();
    }

    public static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero; // Hace el número positivo si es negativo
        }
        return String.valueOf(numero).length(); // Convierte el número a String y cuenta los dígitos
    }
}
