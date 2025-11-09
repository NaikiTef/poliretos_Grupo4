package Figuras;

import java.util.Scanner;

public class Figura1 {
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
        System.out.println();
        System.out.println("Figura 1 usando for:");
        figura1For(filas, columnas);
        System.out.println();
        System.out.println("Figura 1 usando while:");
        figura1While(filas, columnas);
        System.out.println();
        System.out.println("Figura 1 usando do while:");
        figura1DoWhile(filas, columnas);
        System.out.println();

    }
    
    //Figura 1 usando for
    public static void figura1For(int filas, int columnas){
        for(int i = 1; i <= filas; i++){
            for(int j = 1; j <= columnas; j++){
                if(i == 1||i == filas|| j==1 || j == columnas){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Figura 1 usando while
    public static void figura1While(int filas, int columnas){
        int i = 1;
        while(i <= filas){
            int j = 1;
            while(j <= columnas){
                if(i == 1||i == filas|| j==1 || j == columnas){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                j++;
            }

            i++;
            System.out.println();
        }
    }

    //Figura 1 usando do while
    public static void figura1DoWhile(int filas, int columnas){
        int i = 1;
        do{
            int j = 1;
            do{
                if(i == 1||i == filas|| j==1 || j == columnas){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                j++;
            } while(j <= columnas);
            i++;
            System.out.println();
        } while(i <= filas);
    }
}
