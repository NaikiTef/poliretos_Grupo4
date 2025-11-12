package pkserie.pkSeriesNumericas;

public class SerieNumerica7 {
    public Integer numeroAvanza;

    public SerieNumerica7() {
        
    }

    public void imprimirSerieNumericaSiete(Integer n){
        System.out.println(" ");
        System.out.println("Serie 7:");
        System.out.println(" ");
        System.out.println("For:");
    
        for(int i=1; i<n*3; i=i+3){

            System.out.print(i+" ");

        }
        numeroAvanza=1;
        System.out.println(" ");
        System.out.println("Do:");

        do{
            System.out.print(numeroAvanza+" ");
            numeroAvanza=numeroAvanza+3;

        }while(numeroAvanza<n*3);

        numeroAvanza=1;
        System.out.println(" ");
        System.out.println("While:");

        while (numeroAvanza<n*3) {
            System.out.print(numeroAvanza+" ");
            numeroAvanza=numeroAvanza+3;
        }

    }

    
    



}
