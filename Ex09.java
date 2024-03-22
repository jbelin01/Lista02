
    import java.util.Scanner;

public class Ex09 {
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

            vetorC[i * 2] = vetorA[i];

        }
        for (int i = 0; i < vetorB.length; i++){

            vetorC[(i * 2) + 1] = vetorB[i];

        }

        System.out.println("O vetor C tem os seguintes elementos:");

        for ( int i = 0; i <= tamanhoC; i++){

            System.out.printf("posição %d é %.2f \n", i+1 , vetorC[i]);

        }        
        
        leitor.close();
        
    
}
}

