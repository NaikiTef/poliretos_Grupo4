package Figuras;

import java.util.Scanner;

public class Figura16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int filas = 0;
        // Validación para filas: solo números mayores a 0
        do {
            System.out.println("Ingrese el número de filas :");
            try {
                filas = Integer.parseInt(scanner.nextLine().trim());
                if (filas <= 0) {
                    System.out.println("Error: El número de filas debe ser mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                filas = 0; // Valor inválido para mantener el bucle activo
            }
        } while (filas <= 0);
        
        int columnas = 0;
        // Validación para columnas: solo números mayores a 0
        do {
            System.out.println("Ingrese el número de columnas :");
            try {
                columnas = Integer.parseInt(scanner.nextLine().trim());
                if (columnas <= 0) {
                    System.out.println("Error: El número de columnas debe ser mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                columnas = 0; // Valor inválido para mantener el bucle activo
            }
        } while (columnas <= 0);
        
        scanner.close();

        System.out.println("Figura 16 usando for:");
        figura16For(filas, columnas);
        System.out.println();

    }

    public static void figura16For(int filas, int columnas){
        for(int i = 1; i <= filas; i++){
            StringBuilder fila = new StringBuilder();
            
            for(int j = 1; j <= columnas; j++){
                if (j == 1 || j == columnas) {
                    // Extremos izquierdo y derecho: asteriscos
                    fila.append("*");
                } else if (i == 1 || i == filas) {
                    // Extremos superior e inferior: asteriscos
                    fila.append("*");
                } else if (j == columnas / 2 || j == (columnas / 2) + 1) {
                    // Columnas del centro: cruz
                    fila.append("+");
                } else if (i == filas / 2 || i == (filas / 2) + 1) {
                    // Filas del centro: cruz
                    fila.append("+");
                } else {
                    // Entre extremos y centro: guiones
                    fila.append("-");
                }
            }
            System.out.println(fila.toString());
        }
    }

}
