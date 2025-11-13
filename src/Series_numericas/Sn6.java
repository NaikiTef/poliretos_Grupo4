package Series_numericas;

public class Sn6 {

    public void Serie6() {
        Integer nIngresado = 10;
        Integer numero = 1;

        System.out.println("S6 con for");
        for (; numero <= nIngresado; numero++) {
            System.out.println(numero * numero);

        }
        numero = 1;

        System.out.println("S6 con while");
        while (numero <= nIngresado) {
            System.out.println(numero * numero);
            numero++;
        }
        numero = 1;

        System.out.println("S6 con do while");
        do {
            System.out.println(numero * numero);
            numero++;
        } while (numero <= nIngresado);
        numero = 1;
    }

}
