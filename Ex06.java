import java.util.Scanner;

public class Ex06 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetor = new Double[5];
        Double[] vetor2 = new Double[5];        
        Double mediaP;
        Double soma = 0.0;
        
        for (int i = 0; i < vetor.length; i++){

            System.out.printf("digite a nota %d: ", i + 1 ); 
            vetor[i] = leitor.nextDouble();

        }
        for (int i = 0; i < vetor2.length; i++){

            System.out.printf("digite o peso da nota %d: ", i + 1 ); 
            vetor2[i] = leitor.nextDouble();

        }

        for (int i = 0; i < vetor.length; i++){

            

            mediaP = vetor[i] * vetor2[i];

            soma += mediaP;

        }

        System.out.println(" resultado:  " + soma ); 
        

        leitor.close();
        
    
}
}