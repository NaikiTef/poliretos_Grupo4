package Loading;

public class L06 {

    public void Loading6() {
        int barra = 20;
        Integer espacios = barra - 1;
        Integer porcentaje = 0;
        Integer contador = 0;

        System.out.println("l06 con for");
        try {
            for (int i = 0; i < barra / 2; i++) {
                System.out.print(
                        "\r[" + " ".repeat(espacios--) + "<" + "==".repeat(2 * i) + ">" + " ".repeat(espacios--)
                                + " ]");
                System.out.print((porcentaje += 10) + "%");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;

        System.out.println("\nl06 con while");
        try {
            while (contador < barra / 2) {
                System.out.print(
                        "\r[" + " ".repeat(espacios--) + "<" + "==".repeat(2 * contador) + ">" + " ".repeat(espacios--)
                                + " ]");
                System.out.print((porcentaje += 10) + "%");
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
                System.out.print(
                        "\r[" + " ".repeat(espacios--) + "<" + "==".repeat(2 * contador) + ">" + " ".repeat(espacios--)
                                + " ]");
                System.out.print((porcentaje += 10) + "%");
                contador++;
                Thread.sleep(500);
            } while (contador < barra / 2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;
        contador = 0;
    }

}
