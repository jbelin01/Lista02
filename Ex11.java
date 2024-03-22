import java.util.Scanner;

public class Ex11{


    
    public static void executar(){

        Scanner leitor = new Scanner (System.in);     
            
        int[] vetorA = new int[5];
        int[] vetorB = new int[5]; 
        int[] calc = new int[5]; 
        int resultado = 0;                        
        
        for (int i = 0; i < vetorA.length; i++){

            System.out.printf("Digite o número %d do vetorA: ", i + 1 ); 
            vetorA[i] = leitor.nextInt();

        }
        for (int i = 0; i < vetorB.length; i++){

            System.out.printf("Digite o número %d do vetorB: ", i + 1 ); 
            vetorB[i] = leitor.nextInt();

        }

        for ( int i = 0; i < vetorA.length; i++){

            calc[i] = vetorA[i] * vetorB[i];
           
            resultado = resultado + calc[i];

        }

        System.out.println("o produto escalar é: " + resultado);
                       
        
        leitor.close();

    }
        
    
}



