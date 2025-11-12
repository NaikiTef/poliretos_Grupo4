package Figuras;
import java.util.Scanner;

public class Figura4 {

    public void figura4() {
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
                filas = 0; // Valor inválido
            }
        } while (filas <= 0);

        int columnas = 0;
        // Validación para columnas: solo números mayores a 0
        do {
            System.out.println("Ingrese el número de columnas:");
            try {
                columnas = Integer.parseInt(scanner.nextLine().trim());
                if (columnas <= 0) {
                    System.out.println("Error: El número de columnas debe ser mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                columnas = 0;
            }
        } while (columnas <= 0);

        System.out.println("\nFigura 4 usando FOR:");
        figura4For(filas, columnas);
        System.out.println();

        System.out.println("Figura 4 usando WHILE:");
        figura4While(filas, columnas);
        System.out.println();

        System.out.println("Figura 4 usando DO WHILE:");
        figura4DoWhile(filas, columnas);
        System.out.println();
    }

    // Figura con FOR
    public void figura4For(int filas, int columnas) {
        for (int i = 1; i <= filas; i++) {
            for (int e = columnas; e > i; e--) { // Espacios a la izquierda
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Figura con WHILE
    public void figura4While(int filas, int columnas) {
        int i = 1;
        while (i <= filas) {
            int e = columnas;
            while (e > i) {
                System.out.print("  ");
                e--;
            }

            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Figura con DO WHILE
    public void figura4DoWhile(int filas, int columnas) {
        int i = 1;
        do {
            int e = columnas;
            do {
                if (e > i) {
                    System.out.print("  ");
                }
                e--;
            } while (e > 0);

            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i <= filas);
    } 
}


