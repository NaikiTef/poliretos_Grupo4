package Loading;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Loading2 {

    public void loading2(Scanner scanner) {
        char caracter = ' ';
        boolean valido = false;
        
        // Validar que se ingrese un carácter válido
        while (!valido) {
            System.out.print("Ingrese un carácter para la barra de carga: ");
            String entrada = scanner.nextLine().trim();
            
            if (!entrada.isEmpty() && entrada.length() == 1) {
                caracter = entrada.charAt(0);
                valido = true;
            } else {
                System.out.println("Error: Debe ingresar exactamente un carácter.");
            }
        }
        
        System.out.println("Loading 02 --Bucle For (SIN giratorio)");
        for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
            loading02For(porcentaje, caracter);
            pausar(200000); // Pausa de 200,000 microsegundos (0.2 segundos)
        }
        System.out.println("\n\nLoading 02 --Bucle While (SIN giratorio)");
        int porcentajeWhile = 0;
        while (porcentajeWhile <= 100) {
            loading02While(porcentajeWhile, caracter);
            pausar(200000); // Pausa de 200,000 microsegundos (0.2 segundos)
            porcentajeWhile += 5;
        }
        System.out.println("\n\nLoading 02 --Bucle Do While (SIN giratorio)");
        int porcentajeDoWhile = 0;
        do {
            loading02DoWhile(porcentajeDoWhile, caracter);
            pausar(200000); // Pausa de 200,000 microsegundos (0.2 segundos)
            porcentajeDoWhile += 5;
        } while (porcentajeDoWhile <= 100);
        System.out.println();
    }
    private static void pausar(long microsegundos) {
        try {
            TimeUnit.MICROSECONDS.sleep(microsegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    //Loading 02 --Bucle For (SIN giratorio)
    public static void loading02For(int porcentaje, char caracter) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        for (int i = 1; i <= total; i++) {
            if (i <= llenado) {
                barra.append(caracter);
            } else {
                barra.append(' ');
            }
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 02 --Bucle While (SIN giratorio)
    public static void loading02While(int porcentaje, char caracter) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        while (i <= total) {
            if (i <= llenado) {
                barra.append(caracter);
            } else {
                barra.append(' ');
            }
            i++;
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 02 --Bucle Do While (SIN giratorio)
    public static void loading02DoWhile(int porcentaje, char caracter) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        if (total > 0) {
            do {
                if (i <= llenado) {
                    barra.append(caracter);
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i <= total);
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }


}
