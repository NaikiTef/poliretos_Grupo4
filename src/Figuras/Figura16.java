package Figuras;

import java.util.Scanner;

public class Figura16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int filas = 0;
        // Validación para filas: solo números mayores a 0
        do {
            System.out.print("Ingrese filas: ");
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
            System.out.print("Ingrese columnas: ");
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
        
        System.out.println("Figura 16 usando while:");
        figura16While(filas, columnas);
        System.out.println();
        
        System.out.println("Figura 16 usando do while:");
        figura16DoWhile(filas, columnas);
        System.out.println();
    }

    public static void figura16For(int filas, int columnas){
        for(int i = 0; i <= filas; i++){
            for(int j = 0; j <= columnas; j++){
                char ch = ' ';
                for (int k = 0; k < columnas; k++) {
                    if ( (i == 1  && (j == 1 || j == columnas))  ||
                        (i == 3  && j == (columnas/2)+1)        ||
                        (i == 5  && (j == 1 || j == columnas)) ) {
                        ch = '+';
                    }
                    else if ( (i == 2 && (j == 3 || j == columnas-2)) ||
                        (i == 4 && (j == 3 || j == columnas-2)) ) {
                        ch = '-';
                    }
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    //Figura 16 Bucle While
    public static void figura16While(int filas, int columnas){
        int i = 0;
        while(i <= filas){
            int j = 0;
            while(j <= columnas){
                char ch = ' ';
                int k = 0;
                while(k < columnas){
                    if ( (i == 1  && (j == 1 || j == columnas))  ||
                        (i == 3  && j == (columnas/2)+1)        ||
                        (i == 5  && (j == 1 || j == columnas)) ) {
                        ch = '+';
                    }
                    else if ( (i == 2 && (j == 3 || j == columnas-2)) ||
                        (i == 4 && (j == 3 || j == columnas-2)) ) {
                        ch = '-';
                    }
                    k++;
                }
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //Figura 16 Bucle Do While
    public static void figura16DoWhile(int filas, int columnas){
        int i = 0;
        do{
            int j = 0;
            do{
                char ch = ' ';
                int k = 0;
                do{
                    if ( (i == 1  && (j == 1 || j == columnas))  ||
                        (i == 3  && j == (columnas/2)+1)        ||
                        (i == 5  && (j == 1 || j == columnas)) ) {
                        ch = '+';
                    }
                    else if ( (i == 2 && (j == 3 || j == columnas-2)) ||
                        (i == 4 && (j == 3 || j == columnas-2)) ) {
                        ch = '-';
                    }
                    k++;
                } while(k < columnas);
                System.out.print(ch);
                j++;
            } while(j <= columnas);
            System.out.println();
            i++;
        } while(i <= filas);
    }
    
}