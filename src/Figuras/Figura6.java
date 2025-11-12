package Figuras;

import java.util.Scanner;

public class Figura6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

    // Figura con FOR (pirámide normal)
    public static void figura5For(int filas) {
        for (int i = 0; i < filas; i++) {
            // Espacios
            for (int e = i; e < filas - 1; e++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Figura con WHILE
    public static void figura5While(int filas) {
        int i = 0;
        while (i < filas) {
            int e = i;
            while (e < filas - 1) {
                System.out.print(" ");
                e++;
            }

            int j = 0;
            while (j < (2 * i + 1)) {
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
            int e = i;
            do {
                if (e < filas - 1) {
                    System.out.print(" ");
                }
                e++;
            } while (e < filas);

            int j = 0;
            do {
                if (j < (2 * i + 1)) {
                    System.out.print("*");
                }
                j++;
            } while (j < (2 * i + 1));

            System.out.println();
            i++;
        } while (i < filas);
    }
    
}
