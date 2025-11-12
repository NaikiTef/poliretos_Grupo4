package Series_numericas;

import java.util.Scanner;

public class SerieNumerica10 {

    //FOR
    public static void SerieNumericoFor(Scanner scanner){
        long inicial = 0;
        int numTermino = 0;
        boolean valido = false;
        
        // Validar número inicial
        while (!valido) {
            try {
                System.out.print("Ingrese el número inicial: ");
                inicial = Long.parseLong(scanner.nextLine().trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
        valido = false;
        // Validar número de términos
        while (!valido) {
            try {
                System.out.print("Ingrese el número de veces que quiere que se repita la serie: ");
                numTermino = Integer.parseInt(scanner.nextLine().trim());
                if (numTermino > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: El número debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
        long termino = inicial;
        
        for (int i = 0; i < numTermino ; i++) {
            System.out.print(termino + " ");
            termino *= 3;
        }
        
        System.out.print("\n================================================================");
    }

    //WHILE
    public static void SerieNumericoWhile(Scanner scanner){
        long inicial = 0;
        int numTerminos = 0;
        boolean valido = false;
        
        // Validar número inicial
        while (!valido) {
            try {
                System.out.print("\nIngrese el número inicial: ");
                inicial = Long.parseLong(scanner.nextLine().trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
        valido = false;
        // Validar número de términos
        while (!valido) {
            try {
                System.out.print("Ingrese el número de veces que quiere que se repita la serie: ");
                numTerminos = Integer.parseInt(scanner.nextLine().trim());
                if (numTerminos > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: El número debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
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
        long inicial = 0;
        int numTerminos = 0;
        boolean valido = false;
        
        // Validar número inicial
        while (!valido) {
            try {
                System.out.print("\nIngrese el número inicial: ");
                inicial = Long.parseLong(scanner.nextLine().trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
        valido = false;
        // Validar número de términos
        while (!valido) {
            try {
                System.out.print("Ingrese el número de veces que quiere que se repita la serie: ");
                numTerminos = Integer.parseInt(scanner.nextLine().trim());
                if (numTerminos > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: El número debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
        
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

