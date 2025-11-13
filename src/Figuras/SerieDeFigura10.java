package Figuras;


public class SerieDeFigura10 {
    Integer numeroAvanza;

    public void imprimirFiguraDiez(Integer niveles){
        System.out.println(" ");
        System.out.println("Figura Diez:");
        System.out.println("For:");

        Integer espaciosSaltados;
        
        espaciosSaltados=7;
         numeroAvanza=1;

        for(int i=0;i<niveles;i++){

            for(int j=1;j<niveles+13;j++){
                
                    if ((numeroAvanza)%2==0&&j>=espaciosSaltados) {
                        System.out.println("|_+_");
                        espaciosSaltados=espaciosSaltados+3;
                    j=i;
                    }else if(j>=espaciosSaltados&&(numeroAvanza)%2!=0){
                        System.out.println("|_-_");
                        espaciosSaltados=espaciosSaltados+3;
                    j=i;
                    }
                   
                
                    System.out.print(" ");
                    
                }
              

                

              

            }

            System.out.println(" ");
            numeroAvanza++;

        }
    }
    

