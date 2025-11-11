package Series_numericas;

public class SeriesNumerica3 {
    //Serie numerica 3 usando for 
        public static void serieNumerica3For(){
            System.out.println("S3 For: ");
        int numeroAnterior=0;
        int numeroActual=1;
        int denominador=1;

        for(int i=1;i<=8;i++){
            int numerador;
            if (i==1){
                numerador=0;
            } else if (i==2){
                numerador=1;
            } else {
                numerador=numeroAnterior+numeroActual;
                numeroAnterior=numeroActual;
                numeroActual=numerador;
            }
            System.out.print(numerador+"/"+denominador);
            if(i<8){
                System.out.print(", ");
            }
            denominador +=2;
        }
    }


        //Serie numerica 3 usando while
        public static void serieNumerica3While(){
            System.out.println("S3 While: ");
            int numeroAnterior = 0;
        int numeroActual = 1;
        int denominador = 1;
        int i = 1; // Inicialización del contador

        // Condición de continuación del ciclo
        while (i <= 8) { 
            int numerador;
            if (i == 1) {
                numerador = 0;
            } else if (i == 2) {
                numerador = 1;
            } else {
                numerador = numeroAnterior + numeroActual;
                numeroAnterior = numeroActual;
                numeroActual = numerador;
            }

            // Imprimir término
            System.out.print(numerador + "/" + denominador);

            // Agregar coma si no es el último término
            if (i < 8) {
                System.out.print(", ");
            }
            denominador += 2;
            i++; // Incremento del contador (CRUCIAL en el while)
        }
        System.out.println();
        }




        //Serie numerica 3 usando do while
        public static void serieNumerica3DoWhile(){
        System.out.println("S3 Do-While: ");
        int numeroAnterior = 0;
        int numeroActual = 1;
        int denominador = 1;
        int i = 1; // Inicialización del contador

        do {
            int numerador;
            if (i == 1) {
                numerador = 0;
            } else if (i == 2) {
                numerador = 1;
            } else {
                numerador = numeroAnterior + numeroActual;
                numeroAnterior = numeroActual;
                numeroActual = numerador;
            }
            // Imprimir término
            System.out.print(numerador + "/" + denominador);
            // Agregar coma si no es el último término
            if (i < 8) {
                System.out.print(", ");
            }
            denominador += 2;
            i++; // Incremento\
            
        } while (i <=8); // Condición de continuación del ciclo
        
        System.out.println();
    }
}
