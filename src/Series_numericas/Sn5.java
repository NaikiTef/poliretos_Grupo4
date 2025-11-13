package Series_numericas;

public class Sn5 {

    public void Serie5() {

        Integer nIngresado = 10;
        Integer numero = 1;
        Integer contador = 1;

        System.out.println("S5 con for");
        for (int i = 1; i <= nIngresado;) {
            numero++;
            for (int e = 2; e <= numero; e++) {
                if (numero % e == 0 && e < numero) {
                    e = numero + 1;
                } else if (e == numero) {
                    System.out.print(numero + " ");
                    i++;
                }
            }
        }
        System.out.println();
        numero = 1;

        System.out.println("S5 con while");
        while (nIngresado >= numero) {
            contador++;
            for (int i = 2; i <= contador; i++) {
                if (contador % i == 0 && i < contador) {
                    i = contador + 1;
                } else if (i == contador) {
                    System.out.print(contador + " ");
                    numero++;
                }
            }
        }
        System.out.println();
        numero = 1;
        contador = 1;

        System.out.println("S5 con do while");
        do {
            contador++;
            for (int i = 2; i <= contador; i++) {
                if (contador % i == 0 && i < contador) {
                    i = contador + 1;
                } else if (i == contador) {
                    System.out.print(contador + " ");
                    numero++;
                }
            }
        } while (nIngresado >= numero);
        System.out.println();
    }

}
