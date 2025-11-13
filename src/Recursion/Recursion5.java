package Recursion;

import java.util.Scanner;

public class Recursion5 {
    
    public void recursion5(Scanner scanner) {
        
        int inicio, fin;

        while (true) {
            System.out.print("Ingrese el número inicial: ");
            inicio = scanner.nextInt();
    
            System.out.print("Ingrese el número final: ");
            fin = scanner.nextInt();
    
        
        if (inicio > fin) {
            System.out.println("Estás intentando hacer un conteo regresivo. No permitido.");
            System.out.println("Ingresa los números de nuevo.\n");
        } else {
            break; 
        }
    }
        
        System.out.println("Conteo progresivo desde " + inicio + " hasta " + fin + ":");
        conteoProgresivoHasta(inicio, fin);
        
        System.out.print("\n================================================================");
    }
    
    public static void conteoProgresivoHasta(int inicio, int fin) {
        // Caso base: cuando el inicio supera el fin, se detiene
        if (inicio > fin) {
            return; 
        } else {
            System.out.print(inicio + " ");
            conteoProgresivoHasta(inicio + 1, fin); // llamada recursiva
        }
    }
}