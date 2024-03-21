import java.util.Scanner;

public class Ex04 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetor = new Double[5];
        

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("digite o valor para o número %d: ", i + 1 ); 
            vetor[i] = leitor.nextDouble();

        }

        System.out.println("Digite um valor de comparação: " ); 
        Double var = leitor.nextDouble();

        System.out.println(" são inferiores ao valor comparativo:");
        for (int i = 0; i < vetor.length; i++){

          if (vetor[i] < var){
            
            System.out.printf(" número de indice %d \n", i + 1);
          }
          

        }

        leitor.close();
        
    
}
}