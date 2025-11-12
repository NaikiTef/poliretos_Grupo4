package GrafoAutomata8;

import java.util.Scanner;

public class GA4 {

    //Estados
    private static final int Q0 = 0; 
    private static final int Q1 = 1; 
    private static final int Q2 = 2; 
    private static final int Q3 = 3;

    public static boolean validarNumeroDecimal(String cadena) {
        
        int estadoActual = Q0;

        for (char c : cadena.toCharArray()) {
            switch (estadoActual) {
                case Q0:
                    if (c >= '0' && c <= '9') {
                        estadoActual = Q1;
                    } else {
                        return false; 
                    }
                    break;
                case Q1:
                    if (c >= '0' && c <= '9') {
                        estadoActual = Q1; 
                    } else if (c == '.') {
                        estadoActual = Q2;
                    } else {
                        return false; 
                    }
                    break;
                case Q2:
                    if (c >= '0' && c <= '9') {
                        estadoActual = Q3;
                    } else {
                        return false; 
                    }
                    break;
                case Q3:
                    if (c >= '0' && c <= '9') {
                        estadoActual = Q3; 
                    } else {
                        return false; 
                    }
                    break;
                default:
                    return false;
            }
        }

        return estadoActual == Q1 || estadoActual == Q3;
    }

    public static void numeroDecimal(Scanner scanner) {
        
        System.out.print("Ingresa una cadena para validar como número decimal: ");
        String entrada = scanner.nextLine();

        if (validarNumeroDecimal(entrada)) {
            System.out.println("Ese número está entre los puntos de aceptación");
        } else {
            System.out.println("Ese número no está entre los puntos de aceptación");
        }

        scanner.close();
        System.out.print("\n================================================================");
    }
}
