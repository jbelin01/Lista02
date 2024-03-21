import java.util.Scanner;

public class Ex03 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o tamanho do vetor de 1 a 100: ");
        int tamanho = leitor.nextInt();

        if (tamanho > 1 && tamanho <= 100){
            
        Double[] vetor = new Double[tamanho];
        Double[] vetor2 = new Double[2*tamanho];

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("digite o valor para o número %d: ", i + 1 ); 
            vetor[i] = leitor.nextDouble();

        }
        for (int i = 0; i < vetor2.length; i++){

            System.out.printf("digite o valor para o número %d.1: ", i + 1 ); 
            vetor2[i] = leitor.nextDouble();

        }

        for (int i = 0; i < vetor2.length; i++){

            System.out.printf("os valores do número %d.1 são: %.2f \n", i + 1, vetor2[i] ); 
            
        }
        
    }
}
}