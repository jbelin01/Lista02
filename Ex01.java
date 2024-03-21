import java.util.Scanner;

public class Ex01 {
    
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        Double[] sequencia = new Double[5];
        Double media;
        Double soma = 0.0;

        for(int i = 0; i < 5; i++){

            System.out.printf("Digite o número %d: ", i+1);
             sequencia[i] = leitor.nextDouble();

             
        }
        for(int i = 0; i < 5; i++){

           soma += sequencia[i];

             
        }
         
        media = soma / 5;

        System.out.println("A média é : \n" + media);


        System.out.println("Os valores acima da média: ");
        for(int i = 0; i < 5; i++){

            if ( media < sequencia[i]){

                System.out.println("" + sequencia[i]);

            }
        }
        System.out.println("Os valores na média: ");
        for(int i = 0; i < 5; i++){

            if ( media.equals(sequencia[i]) ){
                System.out.println("" + sequencia[i]);
            }
        }
        System.out.println("Os valores abaixo da média: ");
        for(int i = 0; i < 5; i++){

            if ( media > sequencia[i]){
                System.out.println("" + sequencia[i]);
            }
        }



        leitor.close();
                
    }

}
