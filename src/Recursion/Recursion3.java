package Recursion;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Recursion3 {
    private static final Scanner sc = new Scanner(System.in);

    public int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        int n = 0;
        while (true) {
            try {
                n = sc.nextInt();
                if (n > 0) {
                    return n;
                } else {
                    System.out.println("Error el numero debe ser mayor que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error se esperaba numeros!! PORFAVOR INGRESE NUMEROS");
                sc.next(); 
            }
        }
    }

    public int g2_multiplicacion_recursiva(int c, int d) {
        if (d == 0)
            return 0;
        else if (d > 0)
            return c + g2_multiplicacion_recursiva(c, d - 1);
        else
            return - g2_multiplicacion_recursiva(c, -d);
    }

    public void recursion3() {
        int a = pedirNumero("Ingrese el primer número para multiplicar: ");
        int b = pedirNumero("Ingrese el segundo número para multiplicar: ");
        int resultado = g2_multiplicacion_recursiva(a, b);
        System.out.println("El resultado de la multiplicación recursiva es: " + resultado);
    }
}