package Arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Array5 {
    
    private static void imprimirMatriz(char[][] matriz) {
        
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pausar(int milisegundos) {
        try {
            TimeUnit.MILLISECONDS.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void ArrayFor(Scanner scanner, Random random) throws InterruptedException{
        
        System.out.print("Ingrese su nombre completo: ");

        String nombre = scanner.nextLine();  //Se puede escribir el nombre con espacios
        int n = nombre.replace(" ", "").length(); // Tamaño sin contar espacios
        char[][] matriz = new char[n][n];

        // Llenar la matriz vacía
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (char letra : nombre.toCharArray()) {
            
            if (letra == ' ') continue; 
            
            int fila, columna;
            while (true) {
                fila = random.nextInt(n);
                columna = random.nextInt(n);
                if (matriz[fila][columna] == ' ') {
                    matriz[fila][columna] = letra;
                    break;
                } else if (matriz[fila][columna] == letra) {
                    break;
                } else {
                    matriz[fila][columna] = '*';
                    break;
                }
            }
            imprimirMatriz(matriz);
            Thread.sleep(500);
        }
        System.out.println("Matriz final:");
        imprimirMatriz(matriz);
    }
            
    public static void ArrayWhile(Scanner scanner, Random random) throws InterruptedException {
        
        System.out.print("Ingrese su nombre completo: ");
       
        String nombre = scanner.nextLine();  
        int n = nombre.replace(" ", "").length(); 
        char[][] matriz = new char[n][n];


        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        int indice = 0;
        while (indice < nombre.length()) {
            char letra = nombre.charAt(indice);
             
            if (letra == ' ') {
                indice++;
                continue; 
            }

            int fila, columna;
            while (true) {
                fila = random.nextInt(n);
                columna = random.nextInt(n);
                if (matriz[fila][columna] == ' ') {
                    matriz[fila][columna] = letra;
                    break;
                } else if (matriz[fila][columna] == letra) {
                    break;
                } else {
                    matriz[fila][columna] = '*';
                    break;
                }
            }
            imprimirMatriz(matriz);
            Thread.sleep(500);
            indice++;
        }

        System.out.println("Matriz final:");
        imprimirMatriz(matriz);
    }

    public static void ArrayDoWhile(Scanner scanner, Random random) throws InterruptedException{
        
        System.out.print("Ingrese su nombre completo: ");
       
        String nombre = scanner.nextLine();  
        int n = nombre.replace(" ", "").length(); 
        char[][] matriz = new char[n][n];

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        int indice = 0;
        do {
            char letra = nombre.charAt(indice);

            if (letra == ' ') {
                indice++;
                continue; 
            }

            int fila, columna;
            while (true) {
                fila = random.nextInt(n);
                columna = random.nextInt(n);
                if (matriz[fila][columna] == ' ') {
                    matriz[fila][columna] = letra;
                    break;
                } else if (matriz[fila][columna] == letra) {
                    break;
                } else {
                    matriz[fila][columna] = '*';
                    break;
                }
            }

            imprimirMatriz(matriz);
            Thread.sleep(500);
            indice++;
        } while (indice < nombre.length());

        System.out.println("Matriz final:");
        imprimirMatriz(matriz);
    }
}
