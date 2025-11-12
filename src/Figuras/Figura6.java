package Figuras;

import java.util.Scanner;

public class Figura6 {

    public void figura6() {
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

        System.out.println("\nFigura 6 usando FOR:");
        figura6For(filas);
        System.out.println();

        System.out.println("Figura 6 usando WHILE:");
        figura6While(filas);
        System.out.println();

        System.out.println("Figura 6 usando DO WHILE:");
        figura6DoWhile(filas);
        System.out.println();
    }

    // Figura con FOR (pirámide normal)
    public void figura6For(int filas) {
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
    public void figura6While(int filas) {
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
    public void figura6DoWhile(int filas) {
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
