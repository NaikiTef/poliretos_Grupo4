package Loading;

public class Loading6 {

    public void loading6() {
        Integer barra = 20;
        Integer espacios = barra - 1;
        Integer porcentaje = 0;
        Integer contador = 0;

        System.out.println("l06 con for");
        try {
            for (int i = 0; i < barra; i++) {
                System.out.print("\r[" + " ".repeat(i) + "<=>" + " ".repeat(espacios--) + "]");
                System.out.print((porcentaje += 5) + "%");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;

        System.out.println("\nl06 con while");
        try {
            while (contador < barra) {
                System.out.print("\r[" + " ".repeat(contador) + "<=>" + " ".repeat(espacios--) + "]");
                System.out.print((porcentaje += 5) + "%");
                contador++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;
        contador = 0;

        System.out.println("\nl06 con do while");
        try {
            do {
                System.out.print("\r[" + " ".repeat(contador) + "<=>" + " ".repeat(espacios--) + "]");
                System.out.print((porcentaje += 5) + "%");
                contador++;
                Thread.sleep(500);
            } while (contador < barra);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;
        contador = 0;
    }

}
