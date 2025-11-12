package Loading;
import java.util.concurrent.TimeUnit;

public class Loading5 {
    public static void main(String[] args) {
        System.out.println("L05 -- Bucle For");
        for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
            mostrarBarraFor(porcentaje);
            pausar(200000); // Pausa de 0.2 segundos
        }

        System.out.println("\n\nL05 -- Bucle While");
        int porcentajeWhile = 0;
        while (porcentajeWhile <= 100) {
            mostrarBarraWhile(porcentajeWhile);
            pausar(200000);
            porcentajeWhile += 5;
        }

        System.out.println("\n\nL05 -- Bucle Do While");
        int porcentajeDo = 0;
        do {
            mostrarBarraDoWhile(porcentajeDo);
            pausar(200000);
            porcentajeDo += 5;
        } while (porcentajeDo <= 100);

        System.out.println("\n\nAnimación completada ✅");
    }

    // ====================== MÉTODOS DE ANIMACIÓN ======================

    // 🔁 FOR
    public static void mostrarBarraFor(int porcentaje) {
        int total = 20; // longitud total de la barra
        int llenado = (porcentaje * total) / 100;
        char punta = (porcentaje / 5) % 2 == 0 ? '>' : '-'; // alterna entre > y -

        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < total; i++) {
            if (i < llenado) {
                barra.append("=");
            } else if (i == llenado) {
                barra.append(punta);
            } else {
                barra.append(" ");
            }
        }
        barra.append("]");
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush();
    }

    // 🔁 WHILE
    public static void mostrarBarraWhile(int porcentaje) {
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        char punta = (porcentaje / 5) % 2 == 0 ? '>' : '-';

        StringBuilder barra = new StringBuilder("[");
        int i = 0;
        while (i < total) {
            if (i < llenado) {
                barra.append("=");
            } else if (i == llenado) {
                barra.append(punta);
            } else {
                barra.append(" ");
            }
            i++;
        }
        barra.append("]");
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush();
    }

    // 🔁 DO WHILE
    public static void mostrarBarraDoWhile(int porcentaje) {
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        char punta = (porcentaje / 5) % 2 == 0 ? '>' : '-';

        StringBuilder barra = new StringBuilder("[");
        int i = 0;
        if (total > 0) {
            do {
                if (i < llenado) {
                    barra.append("=");
                } else if (i == llenado) {
                    barra.append(punta);
                } else {
                    barra.append(" ");
                }
                i++;
            } while (i < total);
        }
        barra.append("]");
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
        System.out.flush();
    }

    // ====================== MÉTODO DE PAUSA ======================
    private static void pausar(long microsegundos) {
        try {
            TimeUnit.MICROSECONDS.sleep(microsegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
