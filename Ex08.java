import java.util.Scanner;

public class Ex08 {
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetorA = new Double[5];
        Double[] vetorB = new Double[5];        

        int tamanhoC =  vetorA.length + vetorB.length;

        Double[] vetorC = new Double[tamanhoC];         
        
        for (int i = 0; i < vetorA.length; i++){

            System.out.printf("Digite o número %d do vetorA: ", i + 1 ); 
            vetorA[i] = leitor.nextDouble();

        }
        for (int i = 0; i < vetorB.length; i++){

            System.out.printf("Digite o número %d do vetorB: ", i + 1 ); 
            vetorB[i] = leitor.nextDouble();

        }
    
        for (int i = 0; i < vetorA.length; i++){

            vetorC[i] = vetorA[i];

        }
        for (int i = 0; i < vetorB.length; i++){

            vetorC[vetorA.length + i] = vetorB[i];

        }

        System.out.println("O vetor C tem os seguintes elementios:");

        for ( int i = 0; i < vetorC.length; i++){

            System.out.println( vetorC[i]);

        }        
        
        leitor.close();
        
    
}
}