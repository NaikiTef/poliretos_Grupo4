package Loading;
import java.util.concurrent.TimeUnit;

public class Loading4 {
    
    public void loading4() {
        System.out.println("L04 -- Bucle For");
        for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
            mostrarAnimacionFor(porcentaje);
            pausar(200000); // 0.2 segundos
        }

        System.out.println("\n\nL04 -- Bucle While");
        int porcentajeWhile = 0;
        while (porcentajeWhile <= 100) {
            mostrarAnimacionWhile(porcentajeWhile);
            pausar(200000);
            porcentajeWhile += 5;
        }

        System.out.println("\n\nL04 -- Bucle Do While");
        int porcentajeDo = 0;
        do {
            mostrarAnimacionDoWhile(porcentajeDo);
            pausar(200000);
            porcentajeDo += 5;
        } while (porcentajeDo <= 100);

        System.out.println("\n\nAnimación completada ");
    }

    // ========================== MÉTODOS DE ANIMACIÓN ==========================

    //  FOR
    public static void mostrarAnimacionFor(int porcentaje) {
        String[] fases = {"o0o", "0o0", "o0o"}; // ida y vuelta
        int fase = (porcentaje / 5) % fases.length;
        System.out.printf("\rWaiting %s %3d%%", fases[fase], porcentaje);
        System.out.flush();
    }

    //  WHILE
    public static void mostrarAnimacionWhile(int porcentaje) {
        String[] fases = {"o0o", "0o0", "o0o"};
        int fase = (porcentaje / 5) % fases.length;
        System.out.printf("\rWaiting %s %3d%%", fases[fase], porcentaje);
        System.out.flush();
    }

    // DO WHILE
    public static void mostrarAnimacionDoWhile(int porcentaje) {
        String[] fases = {"o0o", "0o0", "o0o"};
        int fase = (porcentaje / 5) % fases.length;
        System.out.printf("\rWaiting %s %3d%%", fases[fase], porcentaje);
        System.out.flush();
    }

    // ========================== MÉTODO DE PAUSA ==========================
    private static void pausar(long microsegundos) {
        try {
            TimeUnit.MICROSECONDS.sleep(microsegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
