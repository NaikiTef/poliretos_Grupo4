package Series_numericas;

public class SerieNumerica1 {
    public static void main(String[] args) {
        // Serie numerica del 1 al 20, solo numeros pares
        System.out.println("Serie numerica de Fibonacci usando for:");
        serieNumericaFor();
        System.out.println();
        System.out.println("Serie numerica de Fibonacci usando while:");
        serieNumericaWhile();
        System.out.println();
        System.out.println("Serie numerica de Fibonacci usando do while:");
        serieNumericaDoWhile();
        System.out.println();
        System.out.println("Serie numerica 2 usando for, while y do while:");
        SerieNumerica2.serieNumerica2For();
        System.out.println();
        System.out.println("Serie numerica 2 usando for:");
        SerieNumerica2.serieNumerica2While();
        System.out.println();
        System.out.println("Serie numerica 2 usando do while:");
        SerieNumerica2.serieNumerica2DoWhile();
        System.out.println();
        System.out.println("Serie numerica 12 usando for:");
        SerieNumerica12.serieNumerica12For();
        System.out.println();
        System.out.println("Serie numerica 12 usando while:");
        SerieNumerica12.serieNumerica12While();
        System.out.println();
        System.out.println("Serie numerica 12 usando do while:");
        SerieNumerica12.serieNumerica12DoWhile();
        System.out.println();
    }

    private static int numero;
    private static int suma;
    private static int numero2;

    //Serie numerica de Fibonacci usando for
    public static void serieNumericaFor(){
        numero = 0;
        numero2 = 1;
        
        for(int i = 1; i <= 20; i++){
            System.out.print(numero + " ");
            suma = numero + numero2;
            numero = numero2;
            numero2 = suma;
        }
        System.out.println();
    }

    //Serie numerica de Fibonacci usando while
    public static void serieNumericaWhile(){
        numero = 0;
        numero2 = 1;
        int i = 1;
        while(i <= 20){
            System.out.print(numero + " ");
            suma = numero + numero2;
            numero = numero2;
            numero2 = suma;
            i++;
        }
        System.out.println();
    }

    //Serie numerica  de Fibonacci usando do while
    public static void serieNumericaDoWhile(){
        numero = 0;
        numero2 = 1;
        int i = 1;
        do{
            System.out.print(numero + " ");
            suma = numero + numero2;
            numero = numero2;
            numero2 = suma;
            i++;
        }while(i <= 20);
        System.out.println();
    }
}
