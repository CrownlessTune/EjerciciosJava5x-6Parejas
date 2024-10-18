package Ejercicios5_0;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mesas = new int[10];

        while (true) {
            mostrarMesas(mesas);

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int comensales = scanner.nextInt();

            if (comensales == -1) {
                System.out.println("Gracias por venir");
                break;
            }

            if (comensales > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + comensales +
                        ". Haga grupos de 4 personas como máximo e intente de nuevo.");
                continue;
            }

            int mesaAsignada = buscarMesa(mesas, comensales);

            if (mesaAsignada != -1) {
                if (mesas[mesaAsignada] == 0) {
                    System.out.println("Por favor, siéntense en la mesa número " + (mesaAsignada + 1) + ".");
                } else {
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (mesaAsignada + 1) + ".");
                }
                mesas[mesaAsignada] += comensales;
            } else {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            }
        }

        scanner.close();
    }

    public static void mostrarMesas(int[] mesas) {
        System.out.print("Mesa no   ");
        for (int i = 1; i <= mesas.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.print("Ocupación ");
        for (int mesa : mesas) {
            System.out.print(mesa + "  ");
        }
        System.out.println();
    }

    public static int buscarMesa(int[] mesas, int comensales) {
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                return i;
            }
        }

        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] + comensales <= 4) {
                return i;
            }
        }

        return -1;
    }
}
