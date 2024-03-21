import java.util.Scanner;

public class Ex05 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetor = new Double[5];
        int conta = 0;

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("digite o valor para o número %d: ", i + 1 ); 
            vetor[i] = leitor.nextDouble();

        }
        
        System.out.println("Digite um valor de comparação: " ); 
        Double var = leitor.nextDouble();

      
        for (int i = 0; i < vetor.length; i++){

          if (vetor[i].equals(var)){            
            conta ++;
          }
          

        }

        System.out.println(" quantidade de vezes que o número é igual ao comparativo: " + conta);

        leitor.close();
        
    
}
}