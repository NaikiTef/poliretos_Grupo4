package Figuras;

import java.util.Scanner;

public class Figura3 {
    
    public void figura3() {
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

        System.out.println("Figura 3 usando for:");
        figura3For(filas, columnas);
        System.out.println();
        System.out.println("Figura 3 usando while:");
        figura3While(filas, columnas);
        System.out.println();
        System.out.println("Figura 3 usando do while:");
        figura3DoWhile(filas, columnas);
        System.out.println();
    }

    public void figura3For(int filas, int columnas){
        for(int i = 0; i <= filas; i++){
            int numeroAsignar = i+1;
            for(int j = 1; j <= numeroAsignar; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void figura3While(int filas, int columnas){
        int i = 0;
        while(i <= filas){
            int numeroAsignar = i+1;
            int j = 1;
            while(j <= numeroAsignar){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void figura3DoWhile(int filas, int columnas){
        int i = 0;
        do{
            int numeroAsignar = i+1;
            int j = 1;
            do{
                System.out.print("*");
                j++;
            } while(j <= numeroAsignar);
            System.out.println();
            i++;
        } while(i <= filas);
    }
}
