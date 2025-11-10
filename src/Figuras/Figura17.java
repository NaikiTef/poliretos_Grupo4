package Figuras;

import java.util.Scanner;

public class Figura17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int filas = 0;
        do{
            System.out.print("Ingrese el número de filas: ");
            try{
                filas = Integer.parseInt(scanner.nextLine().trim());
                if(filas <= 0){
                    System.out.println("Error: El número de filas debe ser mayor a 0.");
                }
            }catch(NumberFormatException e){
                System.out.println("Error: Por favor ingrese solo números enteros.");
                filas = 0; // Valor inválido para mantener el bucle activo
            }
        }while(filas <= 0);

        int columnas = 0;
        do{
            System.out.print("Ingrese el número de columnas: ");
            try{
                columnas = Integer.parseInt(scanner.nextLine().trim());
                if(columnas <= 0){
                    System.out.println("Error: El número de columnas debe ser mayor a 0.");
                }
            }catch(NumberFormatException e){
                System.out.println("Error: Por favor ingrese solo números enteros.");
                columnas = 0; // Valor inválido para mantener el bucle activo
            }
        }while(columnas <= 0);

        scanner.close();

        System.out.println("Figura 17 usando for:");
        figura17For(filas, columnas);
        System.out.println();
        
        System.out.println("Figura 17 usando while:");
        figura17While(filas, columnas);
        System.out.println();
        
        System.out.println("Figura 17 usando do while:");
        figura17DoWhile(filas, columnas);
        System.out.println();
    }

    public static void figura17For(int filas, int columnas){

        for (int fila = 0; fila < filas; fila++) {

            for (int columna = 0; columna < columnas; columna++) {

                char ch = ' ';

                // SOLO for
                for (int i = 0; i < 1; i++) {

                    if ((fila == 0 && (columna == 0 || columna == columnas-1)) ||
                        (fila == filas/3 && columna == columnas/2) ||
                        (fila == (filas*2)/3 && (columna == 0 || columna == columnas-1))) {

                        ch = '1';
                    }
                    else if ((fila == filas/3-1 && columna == columnas/2-1) ||
                            (fila == filas/3-1 && columna == columnas/2+1) ||
                            (fila == filas/3+1 && columna == columnas/2-1) ||
                            (fila == filas/3+1 && columna == columnas/2+1)) {

                        ch = '0';
                    }
                    else if (fila == filas-1 && (columna >= 0 && columna <= columnas/2)) {

                        ch = '.';
                    }
                }

                System.out.print(ch);
            }
            System.out.println();
        }
    }

    //Figura 17 Bucle while
    public static void figura17While(int filas, int columnas){
        int fila = 0;
        while (fila < filas) {
            int columna = 0;
            while (columna < columnas) {
                char ch = ' ';
                
                // SOLO while
                int i = 0;
                while (i < 1) {
                    if ((fila == 0 && (columna == 0 || columna == columnas-1)) ||
                        (fila == filas/3 && columna == columnas/2) ||
                        (fila == (filas*2)/3 && (columna == 0 || columna == columnas-1))) {

                        ch = '1';
                    }
                    else if ((fila == filas/3-1 && columna == columnas/2-1) ||
                            (fila == filas/3-1 && columna == columnas/2+1) ||
                            (fila == filas/3+1 && columna == columnas/2-1) ||
                            (fila == filas/3+1 && columna == columnas/2+1)) {

                        ch = '0';
                    }
                    else if (fila == filas-1 && (columna >= 0 && columna <= columnas/2)) {

                        ch = '.';
                    }
                    i++;
                }

                System.out.print(ch);
                columna++;
            }
            System.out.println();
            fila++;
        }
    }

    //Figura 17 Bucle do while
    public static void figura17DoWhile(int filas, int columnas){
        int fila = 0;
        do {
            int columna = 0;
            do {
                char ch = ' ';
                
                // SOLO do-while
                int i = 0;
                do {
                    if ((fila == 0 && (columna == 0 || columna == columnas-1)) ||
                        (fila == filas/3 && columna == columnas/2) ||
                        (fila == (filas*2)/3 && (columna == 0 || columna == columnas-1))) {

                        ch = '1';
                    }
                    else if ((fila == filas/3-1 && columna == columnas/2-1) ||
                            (fila == filas/3-1 && columna == columnas/2+1) ||
                            (fila == filas/3+1 && columna == columnas/2-1) ||
                            (fila == filas/3+1 && columna == columnas/2+1)) {

                        ch = '0';
                    }
                    else if (fila == filas-1 && (columna >= 0 && columna <= columnas/2)) {

                        ch = '.';
                    }
                    i++;
                } while (i < 1);

                System.out.print(ch);
                columna++;
            } while (columna < columnas);
            System.out.println();
            fila++;
        } while (fila < filas);
    }
    
}