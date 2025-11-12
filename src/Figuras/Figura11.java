package Figuras;

import java.util.Scanner;

public class Figura11 {
    int numeroAvanza;

    public void figura11() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean valido = false;
        
        // Validar entrada
        while (!valido) {
            try {
                System.out.print("Ingrese el tamaño de la figura: ");
                n = Integer.parseInt(scanner.nextLine().trim());
                if (n > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: El tamaño debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
        imprimirFigura11(n);
        scanner.close();
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
