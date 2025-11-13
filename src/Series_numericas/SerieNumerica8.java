package Series_numericas;

public class SerieNumerica8 {
    
     public Integer numeroAvanza;

    public SerieNumerica8() {
        
    }

    public void imprimirSerieNumericaOcho(Integer n){
        System.out.println(" ");
        System.out.println("Serie 8:");
        System.out.println(" ");
        System.out.println("For:");
    
        for(int i=3; i<n*5; i=i+5){

            System.out.print(i+" ");

        }

        numeroAvanza=3;
        System.out.println(" ");
        System.out.println("Do:");

        do{
            System.out.print(numeroAvanza+" ");
            numeroAvanza=numeroAvanza+5;

        }while(numeroAvanza<n*5);

        numeroAvanza=3;
        System.out.println(" ");
        System.out.println("While:");

        while (numeroAvanza<n*5) {
            System.out.print(numeroAvanza+" ");
            numeroAvanza=numeroAvanza+5;
        }

    }
}
