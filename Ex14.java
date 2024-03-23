import java.util.Scanner;

        public class Ex14 {
            
            public static void executar(){
        
                Scanner leitor = new Scanner (System.in);     
                Double[] vetorA = new Double[5];  
                                        
                for (int i = 0; i < vetorA.length; i++){
        
                    System.out.printf("Digite o número %d do vetorA: ", i + 1 ); 
                    vetorA[i] = leitor.nextDouble();
        
                }

                Double maior = vetorA[0];  
                Double ultimo = vetorA[4]; 
                int posicao = 0;

                               
                for (int i = 1; i < vetorA.length; i++){

                    if (vetorA[i] > maior){
                                                
                        maior = vetorA[i];
                        posicao = i;

                    }
        
                }


                vetorA[4] = maior;
                vetorA[posicao] = ultimo;

                System.out.println("" + ultimo);
                System.out.println("" + posicao);
                                      
                for (int i = 0; i < vetorA.length; i++){

                    System.out.printf("o vetor %d é: %.2f \n", i,  vetorA[i]);
                    
        
                }
                
                
                leitor.close();
                
            
        }
        }
        