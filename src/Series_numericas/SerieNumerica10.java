package Series_numericas;

import java.util.Scanner;

public class SerieNumerica10 {

    //FOR
    public static void SerieNumericoFor(Scanner scanner){
        
        System.out.print("Ingrese el número inicial: ");
        long inicial = scanner.nextLong();
        
        System.out.print("Ingrese el número de veces que quiere que se repita la serie: ");
        int numTermino = scanner.nextInt();
        
        long termino = inicial;
        
        for (int i = 0; i < numTermino ; i++) {
            System.out.print(termino + " ");
            termino *= 3;
        }
        
        System.out.print("\n================================================================");
    }

    //WHILE
    public static void SerieNumericoWhile(Scanner scanner){
        
        System.out.print("\nIngrese el número inicial: ");
        long inicial = scanner.nextLong();
        
        System.out.print("Ingrese el número de veces que quiere que se repita la serie: ");
        int numTerminos = scanner.nextInt();
        
        long termino = inicial;
        int i = 0;
        while (i < numTerminos) {
            System.out.print(termino + " ");
            termino *= 3;
            i++;
        }
        
        System.out.print("\n================================================================");
    }

    //DO WHILE
    public static void SerieNumericoDoWhile(Scanner scanner){
        
        System.out.print("\nIngrese el número inicial: ");
        long inicial = scanner.nextLong();
        
        System.out.print("Ingrese el número de veces que quiere que se repita la serie: ");
        int numTerminos = scanner.nextInt();
        
        long termino = inicial;
        int i = 0;
        do {
            System.out.print(termino + " ");
            termino *= 3;
            i++;
        } while (i < numTerminos);
        
        System.out.print("\n================================================================");

    }
}

