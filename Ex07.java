import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetor = new Double[5];
        Double[] vetor2 = new Double[5];        
        
        
        for (int i = 0; i < vetor.length; i++){

            System.out.println("Digite valores pro vetor 1: " ); 
            vetor[i] = leitor.nextDouble();

        }
        for (int i = 0; i < vetor2.length; i++){

            System.out.println("Digite valores pro vetor 2: " ); 
            vetor2[i] = leitor.nextDouble();

        }

        boolean comparador = Arrays.equals(vetor, vetor2);

        if(comparador){

            System.out.println("os vetores são iguais!");
            
        }
        else{

            System.out.println("os vetores são diferentes!");

        }

         
        

        leitor.close();
        
    
}
}
