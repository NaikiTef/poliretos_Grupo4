package Series_caracteres;

import java.util.Scanner;

public class Sc6 {

    public void SerieCaracteres6(Scanner scanner) {
        System.out.print("Ingrese el tamanio de la figura: ");
        int nElementos = scanner.nextInt();
        scanner.nextLine();

        int contador = 1;
        int x = 97;

        System.out.println("\nSc6 con for");
        for (int i = 1; i <= nElementos; i++) {
            if (x > 122) {
                x = 97;
            }
            System.out.print((char) (x) + " ");
            x++;
        }
        x = 97;

        System.out.println("\nSc6 con while");
        while (contador <= nElementos) {
            if (x > 122) {
                x = 97;
            }
            System.out.print((char) (x) + " ");
            x++;
            contador++;
        }
        contador = 1;
        x = 97;

        System.out.println("\nSc6 con do while");
        do {
            if (x > 122) {
                x = 97;
            }
            System.out.print((char) (x) + " ");
            x++;
            contador++;
        } while (contador <= nElementos);
        // No cerrar el scanner aquí
    }
}
