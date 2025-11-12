package Figuras;

import java.util.Scanner;

public class Figura11 {
    int numeroAvanza;

    public void figura11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la figura: ");
        int n = scanner.nextInt();
        imprimirFigura11(n);
    }

    public void imprimirFigura11(Integer n){
        numeroAvanza=1;
        System.out.println(" ");
        System.out.println("Figura Once:");
        System.out.println("For:");
         for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) System.out.print(" ");
            System.out.print("|");
            for (int j = 0; j <= i; j++) System.out.print("-");
            System.out.println();
        }
        numeroAvanza=0;
        System.out.println("Do:");
        do{
            for (int s = 0; s < numeroAvanza; s++) System.out.print(" ");
            System.out.print("|");
            for (int j = 0; j <= numeroAvanza; j++) System.out.print("-");
            System.out.println();
            numeroAvanza++;
        }while(numeroAvanza<n);

        System.out.println("While:");
        numeroAvanza=0;
        while (numeroAvanza<n) {
            for (int s = 0; s < numeroAvanza; s++) System.out.print(" ");
            System.out.print("|");
            for (int j = 0; j <= numeroAvanza; j++) System.out.print("-");
            System.out.println();
            numeroAvanza++;
            
        }
    }

}
