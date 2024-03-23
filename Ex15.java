import java.util.Scanner;

public class Ex15 {
    
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetorA = new Double[5];

        System.out.printf("Digite o número 1 do vetorA: ");
        vetorA[0] = leitor.nextDouble();
             
       
        for (int i = 1; i < vetorA.length; i++){

            System.out.printf("Digite o número %d do vetorA: ", i + 1 );            
            vetorA[i] = leitor.nextDouble();
            if (vetorA[i] <= vetorA[i-1]) {
                
                System.out.println("inválido! Digite novamente.");
                i--;

            }


        }
        
        for (int i = 0; i < vetorA.length; i++){

            System.out.printf("o vetor %d é: %.2f \n", i + 1,  vetorA[i]);
            

        }
        
        leitor.close();
        
    
}
}