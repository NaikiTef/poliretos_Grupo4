package Arrays;

import java.util.Scanner;

public class Array2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1️ Pedir nombre completo y validar
        String nombreCompleto;
        do {
            System.out.print("Ingrese su nombre y apellido (solo letras y espacios): ");
            nombreCompleto = scanner.nextLine();
            if (!esValidaCadena(nombreCompleto)) {
                System.out.println("Error: Solo se permiten letras y espacios. Intente nuevamente.");
            }
        } while (!esValidaCadena(nombreCompleto));

        // Obtener iniciales (solo primera y segunda palabra)
        String iniciales = obtenerIniciales(nombreCompleto);

        //  Pedir tamaño de la matriz
        int tamaño = 0;
        boolean valido = false;
        do {
            System.out.print("Ingrese el tamaño de la matriz (entero positivo): ");
            if (scanner.hasNextInt()) {
                tamaño = scanner.nextInt();
                if (tamaño > 1) {
                    valido = true;
                } else {
                    System.out.println("Error: El tamaño debe ser un número mayor que 1.");
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); // limpiar entrada inválida
            }
        } while (!valido);

        // 3 Pedir carácter de relleno
        String caracter;
        do {
            System.out.print("Ingrese el carácter para dibujar las iniciales: ");
            caracter = scanner.next();
            if (!esCaracterValido(caracter)) {
                System.out.println("Error: Debe ingresar solo un carácter visible. Intente nuevamente.");
            }
        } while (!esCaracterValido(caracter));

        // 4 Mostrar las iniciales y dibujar la matriz
        System.out.println("\nIniciales detectadas: " + iniciales);
        System.out.println("Matriz generada:\n");

        char letra1 = iniciales.charAt(0);
        char letra2 = iniciales.length() > 1 ? iniciales.charAt(1) : ' ';

        dibujarIniciales(letra1, letra2, tamaño, caracter);

        scanner.close();
    }

    // Validar nombre
    public static boolean esValidaCadena(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return false;
        }
        for (char c : cadena.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    //  Obtener iniciales (máximo dos letras)
    public static String obtenerIniciales(String nombreCompleto) {
        String[] partes = nombreCompleto.trim().split("\\s+");
        StringBuilder iniciales = new StringBuilder();

        for (String parte : partes) {
            if (!parte.isEmpty()) {
                iniciales.append(Character.toUpperCase(parte.charAt(0)));
            }
            if (iniciales.length() == 2) break; // solo las dos primeras iniciales
        }

        return iniciales.toString();
    }

    //  Validar el carácter ingresado
    public static boolean esCaracterValido(String c) {
        return c != null && c.length() == 1 && !Character.isWhitespace(c.charAt(0));
    }

    //  Dibujar las iniciales
    public static void dibujarIniciales(char l1, char l2, int n, String c) {
        for (int i = 0; i < n; i++) {
            dibujarLetra(l1, n, c, i);
            System.out.print("   "); // espacio entre letras
            if (l2 != ' ') {
                dibujarLetra(l2, n, c, i);
            }
            System.out.println();
        }
    }

    //  Dibujar cada letra según la inicial
    public static void dibujarLetra(char letra, int n, String c, int fila) {
        letra = Character.toUpperCase(letra);

        switch (letra) {
            case 'A':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n / 2 || j == 0 || j == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'B':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || fila == 0 || fila == n / 2 || fila == n - 1 || (j == n - 1 && fila != n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'C':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == 0) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'D':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || fila == 0 || fila == n - 1 || (j == n - 1 && fila != 0 && fila != n - 1)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'E':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n / 2 || fila == n - 1 || j == 0) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'F':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n / 2 || j == 0) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'G':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == 0 || (j == n - 1 && fila >= n / 2) || (fila == n / 2 && j >= n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'H':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || fila == n / 2) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'I':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == n / 2) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'J':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || j == n / 2 || (fila == n - 1 && j <= n / 2) || (j == 0 && fila >= n - 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'K':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || (j == n - 1 - fila && fila <= n / 2) || (j == fila - n / 2 && fila >= n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'L':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || fila == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'M':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || (j == fila && fila <= n / 2) || (j == n - 1 - fila && fila <= n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'N':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || j == fila) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'O':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == 0 || j == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'P':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || fila == 0 || fila == n / 2 || (j == n - 1 && fila < n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'Q':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == 0 || j == n - 1 || (j == fila && fila >= n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'R':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || fila == 0 || fila == n / 2 || (j == n - 1 && fila < n / 2) || (j == fila - n / 2 && fila > n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'S':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n / 2 || fila == n - 1 || (j == 0 && fila < n / 2) || (j == n - 1 && fila > n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'T':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || j == n / 2) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'U':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || fila == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'V':
                for (int j = 0; j < n; j++) {
                    if ((j == 0 && fila < n - 1) || (j == n - 1 && fila < n - 1) || (j == n / 2 && fila == n - 1)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'W':
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || (j == fila && fila >= n / 2) || (j == n - 1 - fila && fila >= n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'X':
                for (int j = 0; j < n; j++) {
                    if (j == fila || j == n - 1 - fila) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'Y':
                for (int j = 0; j < n; j++) {
                    if ((j == fila && fila <= n / 2) || (j == n - 1 - fila && fila <= n / 2) || (j == n / 2 && fila > n / 2)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            case 'Z':
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == n - 1 - fila) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                break;

            default:
                // Si la letra no está definida, se muestra un cuadrado
                for (int j = 0; j < n; j++) {
                    if (fila == 0 || fila == n - 1 || j == 0 || j == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
        }
    }
}
