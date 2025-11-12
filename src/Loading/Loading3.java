package Loading;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Loading3 {
    
    public void loading3(Scanner sc) {
        char caracter;

        //  Validar el carácter
        do {
            System.out.print("Ingrese un carácter para la animación: ");
            String entrada = sc.nextLine();
            if (esCaracterValido(entrada)) {
                caracter = entrada.charAt(0);
                break;
            } else {
                System.out.println("Error: Debe ingresar un único carácter visible (no espacio en blanco).");
            }
        } while (true);

        int longitud = 20; // longitud de la barra
        System.out.println("\nDesplazamiento del carácter '" + caracter + "' en una barra de 20 posiciones\n");

        //  For
        System.out.println("L03 --Bucle For");
        for (int i = 0; i < longitud; i++) {
            mostrarBarra(caracter, i, longitud);
            pausar(200000); // 0.2 segundos
        }

        //  While
        System.out.println("\n\nL03 --Bucle While");
        int posWhile = 0;
        while (posWhile < longitud) {
            mostrarBarra(caracter, posWhile, longitud);
            pausar(200000);
            posWhile++;
        }

        //  Do While
        System.out.println("\n\nL03 --Bucle Do While");
        int posDo = 0;
        do {
            mostrarBarra(caracter, posDo, longitud);
            pausar(200000);
            posDo++;
        } while (posDo < longitud);

        System.out.println("\n\nAnimación completada ✅");
        sc.close();
    }

    //  Mostrar barra
    public static void mostrarBarra(char caracter, int posicion, int longitud) {
        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < longitud; i++) {
            if (i == posicion) {
                barra.append(caracter);
            } else {
                barra.append(" ");
            }
        }
        barra.append("] ");
        int porcentaje = (int) ((posicion + 1) * (100.0 / longitud));
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush();
    }

    //  Validar entrada
    public static boolean esCaracterValido(String entrada) {
        return entrada != null && entrada.length() == 1 && !Character.isWhitespace(entrada.charAt(0));
    }

    //  Método de pausa
    private static void pausar(long microsegundos) {
        try {
            TimeUnit.MICROSECONDS.sleep(microsegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
