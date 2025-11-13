package Figuras;

import java.util.Scanner;

public class Figura13 {

    public void FiguraFor(Scanner scanner){
        
        System.out.print("Ingrese el número de filas que desea del triángulo de números: ");
        
        int numFila = scanner.nextInt();
        
        for (int i = 1; i <= numFila; i++) {
            for (int j = 1; j <= i; j++) {
                int numMostrar = ((j - 1) % 9) + 1;  // 1-9
                System.out.print(numMostrar);
            }
            System.out.println();
        }
        System.out.print("\n================================================================\n");

    }

    public void FiguraWhile(Scanner scanner){
        
        System.out.print("Ingrese el número de filas que desea del triángulo de números: ");
        
        int numFila = scanner.nextInt();
        
        int i = 1;
        while (i <= numFila){
            int j = 1;
            while (j <= i){
                int numMostrar = ((j - 1) % 9) + 1;  
                System.out.print(numMostrar);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.print("\n================================================================\n");
    }

    public void FiguraDoWhile(Scanner scanner){
        
        System.out.print("Ingrese el número de filas que desea del triángulo de números: ");
        
        int numFila = scanner.nextInt();
        
        int i = 1;
        do {
            int j = 1;
            do {
                int numMostrar = ((j - 1) % 9) + 1;  
                System.out.print(numMostrar);
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= numFila);
        System.out.print("\n================================================================\n");
    }
}
