import java.util.Scanner;

public class Ex02 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o tamanho do vetor de 1 a 100: ");
        int tamanho = leitor.nextInt();

        if (tamanho > 1 && tamanho <= 100){
            
        Double[] vetor = new Double[tamanho];

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("digite o valor para o número %d: ", i + 1 ); 
            vetor[i] = leitor.nextDouble();

        }
        for (int i = 0; i < vetor.length; i++){

            if(vetor[i] > 0){

                System.out.printf("O número %.2f a posição dele é %d e ele é positivo \n", vetor[i], i+1 );

            }
            else if (vetor[i] == 0) {
                
                System.out.printf("O número %.2f a posição dele é %d e ele é igual a 0. \n", vetor[i], i+1 );
            }
            else{

                System.out.printf("no número %.2f a posição dele é %d e ele é negativo \n", vetor[i], i+1 );

            }
        }
        
    }

    } 
    
}
