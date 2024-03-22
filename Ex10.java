import java.util.Scanner;

public class Ex10 {
    
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        Double[] vetorA = new Double[5];
        Double[] vetorB = new Double[5]; 
        int posicao = 0;       

        int tamanhoC =  vetorA.length + vetorB.length;

        Double[] vetorC = new Double[tamanhoC];         
        
        for (int i = 0; i < vetorA.length; i++){

            System.out.printf("Digite o número %d do vetorA: ", i + 1 ); 
            vetorA[i] = leitor.nextDouble();

        }
        
    
        for (int i = vetorA.length - 1; i >= 0 ; i--){

            vetorB[posicao] = vetorA[i];
            posicao++;

        }
        

        System.out.println("O vetor B tem os seguintes elementos:");

        for ( int i = 0; i < vetorB.length; i++){

            System.out.println("" + vetorB[i]);

        }        
        
        leitor.close();
        
    
}
}


