package Figuras;

import java.util.Scanner;

public class Figura5 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // No necesitas columnas en este caso, ya que la figura depende solo del número de filas.

        int filas = 0;
        // Validación para filas: solo números mayores a 0
        do {
            System.out.println("Ingrese el número de filas:");
            try {
                filas = Integer.parseInt(scanner.nextLine().trim());
                if (filas <= 0) {
                    System.out.println("Error: El número de filas debe ser mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                filas = 0;
            }
        } while (filas <= 0);

        scanner.close();

        System.out.println("\nFigura 5 usando FOR:");
        figura5For(filas);
        System.out.println();

        System.out.println("Figura 5 usando WHILE:");
        figura5While(filas);
        System.out.println();

        System.out.println("Figura 5 usando DO WHILE:");
        figura5DoWhile(filas);
        System.out.println();
    }

    // Figura con FOR (pirámide invertida centrada)
    public static void figura5For(int filas) {
        for (int i = 0; i < filas; i++) {
            // Espacios
            for (int e = 0; e < i; e++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 0; j < (2 * (filas - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Figura con WHILE
    public static void figura5While(int filas) {
        int i = 0;
        while (i < filas) {
            int e = 0;
            while (e < i) {
                System.out.print(" ");
                e++;
            }

            int j = 0;
            while (j < (2 * (filas - i) - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }

    // Figura con DO WHILE
    public static void figura5DoWhile(int filas) {
        int i = 0;
        do {
            int e = 0;
            do {
                if (e < i) {
                    System.out.print(" ");
                }
                e++;
            } while (e < i);

            int j = 0;
            do {
                if (j < (2 * (filas - i) - 1)) {
                    System.out.print("*");
                }
                j++;
            } while (j < (2 * (filas - i) - 1));

            System.out.println();
            i++;
        } while (i < filas);
    }
    
}
