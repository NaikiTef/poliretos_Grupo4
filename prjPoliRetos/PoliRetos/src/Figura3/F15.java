package Figura3;

import java.util.Scanner;

public class F15 {

   public static void FiguraFor(Scanner scanner){
        
        System.out.print("Ingrese el número de filas para el Triángulo de Pascal: ");
        
        int filas = scanner.nextInt();
        
        for (int i = 0; i < filas; i++) {
            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + "  ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.print("\n================================================================\n");
    }

    public static void FiguraWhile(Scanner scanner){
        
        System.out.print("Ingrese el número de filas para el Triángulo de Pascal: ");

        int filas = scanner.nextInt();

        int i = 0;
        while (i < filas){
            int j = 0;
            int valor = 1;
            while (j <= i){
                System.out.print(valor + "  ");
                valor = valor * (i - j) / (j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.print("\n================================================================\n");
    }

    public static void FiguraDoWhile(Scanner scanner){
        
        System.out.print("Ingrese el número de filas para el Triángulo de Pascal: ");

        int filas = scanner.nextInt();

        int i = 0;
        
        do{
            int j = 0;
            int valor = 1;
                do{
                    System.out.print(valor + "  ");
                    valor = valor * (i - j) / (j + 1);
                    j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < filas);
        System.out.print("\n================================================================\n");
    }
}
