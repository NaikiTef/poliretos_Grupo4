package Loading;

import java.util.concurrent.TimeUnit;

public class Loading1 {
    public static void main(String[] args) {
        System.out.println("Loading 01 --Bucle For");
        for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
            loadingBarra(porcentaje);
            pausar(200000); // Pausa de 200,000 microsegundos (0.2 segundos)
        }
        System.out.println("\n\nLoading 01 --Bucle While");
        int porcentajeWhile = 0;
        while (porcentajeWhile <= 100) {
            loadingBarra2(porcentajeWhile);
            pausar(200000); // Pausa de 200,000 microsegundos (0.2 segundos)
            porcentajeWhile += 5;
        }
        System.out.println("\n\nLoading 01 --Bucle Do While");
        int porcentajeDoWhile = 0;
        do {
            loadingBarra3(porcentajeDoWhile);
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

    //Loading 01 --Bucle For
    public static void loadingBarra(int porcentaje) {
        String[] spinner = {"|", "/", "-", "\\"};
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        for (int i = 1; i <= total; i++) {
            if (i == llenado + 1) {
                barra.append(spinner[(porcentaje / 5) % 4]);
            } else {
                barra.append(" ");
            }
        }
        barra.append("]");
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush();
    }
    //Loading 01 --Bucle While
    public static void loadingBarra2(int porcentaje) {
        String[] spinner = {"|", "/", "-", "\\"};
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        while (i <= total) {
            if (i == llenado + 1) {
                // Carácter giratorio basado en el porcentaje
                barra.append(spinner[(porcentaje / 5) % 4]);
            } else {
                barra.append(" ");
            }
            i++;
        }
        barra.append("]");
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush(); // Asegura que se muestre inmediatamente
    }

    //Loading 01 --Bucle Do While
    public static void loadingBarra3(int porcentaje) {
        String[] spinner = {"|", "/", "-", "\\"};
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        if (total > 0) {
            do {
                if (i == llenado + 1) {
                    // Carácter giratorio basado en el porcentaje
                    barra.append(spinner[(porcentaje / 5) % 4]);
                } else {
                    barra.append(" ");
                }
                i++;
            } while (i <= total);
        }
        barra.append("]");
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush(); // Asegura que se muestre inmediatamente
    }
}
