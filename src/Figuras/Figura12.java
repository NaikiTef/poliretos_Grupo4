package Figuras;

public class Figura12 {

    public void imprimirFigura12(Integer n){
        System.out.println(" ");
        System.out.println("Figura Doce:");
        System.out.println("For:");

        int variableAvanza;
         for(int i=1;i<=n;i++){
            variableAvanza=i;
            for(int j=1;variableAvanza<=n;j++){
                System.out.print(j);
                variableAvanza++;
            }
            System.out.println(" ");
        
    }
    System.out.println("Do:");
    int i=1;
        do{
             variableAvanza=i;
            for(int j=1;variableAvanza<=n;j++){
                System.out.print(j);
                variableAvanza++;
            }
            System.out.println(" ");
            i++;

        }while(i<=n);



        System.out.println("While:");
        i=1;
        while (i<=n) {
             variableAvanza=i;
            for(int j=1;variableAvanza<=n;j++){
                System.out.print(j);
                variableAvanza++;
            }
            System.out.println(" ");
            i++;
        }
    }
    }
    

