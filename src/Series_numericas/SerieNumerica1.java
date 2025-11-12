package Series_numericas;

public class SerieNumerica1 {

    

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
