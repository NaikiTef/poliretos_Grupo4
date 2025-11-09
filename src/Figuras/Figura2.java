package Figuras;

import java.util.Scanner;

public class Figura2 {
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
            System.out.println("Ingrese el número de columnas:");
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
        
        System.out.println("Figura 2 usando for:");
        figura2For(filas, columnas);
        System.out.println();
        System.out.println("Figura 2 usando while:");
        figura2While(filas, columnas);
        System.out.println();
        System.out.println("Figura 2 usando do while:");
        figura2DoWhile(filas, columnas);
        System.out.println();
    }

    public static void figura2For(int filas, int columnas){
        for(int i = 1; i <= filas; i++){
            for(int j = 1; j <= columnas; j++){
                if(i == 1 || i == filas || j == 1 || j == columnas){
                    if((i + j) % 2 == 0){
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Figura 2 usando while
    public static void figura2While(int filas, int columnas){
        int i = 1;
        while(i <= filas){
            int j = 1;
            while(j <= columnas){
                if(i == 1 || i == filas || j == 1 || j == columnas){
                    if((i + j) % 2 == 0){
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //Figura 2 usando do while
    public static void figura2DoWhile(int filas, int columnas){
        int i = 1;
        do{
            int j = 1;
            do{
                if(i == 1 || i == filas || j == 1 || j == columnas){
                    if((i + j) % 2 == 0){
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else {
                    System.out.print(" ");
                }
                j++;
            } while(j <= columnas);
            System.out.println();
            i++;
        } while(i <= filas);
    }
}