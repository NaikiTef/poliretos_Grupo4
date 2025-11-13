package Recursion;

import java.util.Scanner;

public class Recursion6 {
    private static final Scanner sc = new Scanner(System.in);

    public int pedirNumero(String mensaje) {
        int nume;
        do {
            System.out.print(mensaje);
            nume = sc.nextInt();
            if (nume < 0) {
                System.out.println("Por favor ingrese un número mayor o igual a cero.");
            }
        } while (nume < 0);
        return nume;
    }

    public void g2_conteo_regresivo(int n) {
        if (n < 0)
            return;
        System.out.println("Avance: " + n);
        g2_conteo_regresivo(n - 1);
    }

    public void g2_conteo_regresivo_for(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println("Avance: " + i);
        }
    }

    public void g2_conteo_regresivo_while(int n) {
        int i = n;
        while (i >= 0) {
            System.out.println("Avance: " + i);
            i--;
        }
    }
}