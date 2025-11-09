package Arrays;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = scanner.nextLine().trim();

        // Validación: no vacío, solo letras y espacios
        while (nombreCompleto.isEmpty() || !validarSoloLetras(nombreCompleto)) {
            System.out.println("Error: el nombre solo puede contener letras y espacios.");
            System.out.println("Ingrese su nombre completo:");
            nombreCompleto = scanner.nextLine().trim();
        }

        String[] palabras = nombreCompleto.split(" ");

        System.out.println("Ingrese el porcentaje de carga para cada palabra (separado por espacios):");
        String[] porcentajeStr = scanner.nextLine().trim().split(" ");

        // Validar que la cantidad de porcentajes coincida con la cantidad de palabras
        while (porcentajeStr.length != palabras.length) {
            System.out.println("Error: debe ingresar " + palabras.length + " porcentajes.");
            System.out.println("Ingrese nuevamente los porcentajes:");
            porcentajeStr = scanner.nextLine().trim().split(" ");
        }

        // Convertir porcentajes a números
        int[] porcentajes = new int[porcentajeStr.length];
        for (int i = 0; i < porcentajeStr.length; i++) {
            try {
                porcentajes[i] = Integer.parseInt(porcentajeStr[i]);
                if (porcentajes[i] < 0 || porcentajes[i] > 100) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: cada porcentaje debe ser un número entre 0 y 100.");
                return;
            }
        }

        // Bucle For
        System.out.println("Bucle For:");
        for (int i = 0; i < palabras.length; i++) {
            imprimirBarraCarga(porcentajes[i], palabras[i]);
        }
        System.out.println();
        // Bucle While
        System.out.println("Bucle While:");
        for (int i = 0; i < palabras.length; i++) {
            imprimirBarraCarga2(porcentajes[i], palabras[i]);
        }

        System.out.println();
        // Bucle Do While
        System.out.println("Bucle Do While:");
        for (int i = 0; i < palabras.length; i++) {
            imprimirBarraCarga3(porcentajes[i], palabras[i]);
        }

        scanner.close();
    }

    // Método para validar que el nombre contenga solo letras y espacios
    public static boolean validarSoloLetras(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    // Array 01 - Bucle For
    public static void imprimirBarraCarga(int porcentaje, String palabra) {
        int bloques = porcentaje / 10;
        StringBuilder barra = new StringBuilder();

        for (int i = 0; i < bloques; i++) {
            barra.append("=");
        }

        // Muestra los primeros caracteres de la palabra (como en el ejemplo)
        String palabraCorta = palabra.substring(0, Math.min(6, palabra.length()));
        System.out.printf("[%-15s] %3d%% %s\n", barra.toString() + ">", porcentaje, palabraCorta);
    }

    // Array 01 - Bucle While
    public static void imprimirBarraCarga2(int porcentaje, String palabra) {
        int bloques = porcentaje / 10;
        StringBuilder barra = new StringBuilder();

        int i = 0;
        while (i < bloques) {
            barra.append("=");
            i++;
        }

        // Muestra los primeros caracteres de la palabra (como en el ejemplo)
        String palabraCorta = palabra.substring(0, Math.min(6, palabra.length()));
        System.out.printf("[%-15s] %3d%% %s\n", barra.toString() + ">", porcentaje, palabraCorta);
    }

    // Array 01 - Bucle Do While
    public static void imprimirBarraCarga3(int porcentaje, String palabra) {
        int bloques = porcentaje / 10;
        StringBuilder barra = new StringBuilder();

        int i = 0;
        if (bloques > 0) { // Necesario para asegurar la ejecución del do-while
            do {
                barra.append("=");
                i++;
            } while (i < bloques);
        }

        // Muestra los primeros caracteres de la palabra (como en el ejemplo)
        String palabraCorta = palabra.substring(0, Math.min(6, palabra.length()));
        System.out.printf("[%-15s] %3d%% %s\n", barra.toString() + ">", porcentaje, palabraCorta);
    }
}
