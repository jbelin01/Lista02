import java.util.Scanner;

        public class Ex13 {
            
            public static void executar(){
        
                Scanner leitor = new Scanner (System.in);     
                    
                               
                int n;
                int i;  
                int calc;   
                
                System.out.println("Digite valor de n: "); 
                n = leitor.nextInt();

                Double[] vetorA = new Double[n];
                
                
                vetorA[0] = 1.0;
                vetorA[1] = 1.0;
                
                System.out.printf("n = %d e vetor = %.0f, %.0f ", n, vetorA[0], vetorA[1]);
                     
                
                for ( i = 2; i < n; i++){
        
                    vetorA[i] = vetorA[i - 1] + vetorA[i - 2];

                    System.out.printf(", %.0f ", vetorA[i] );

                }


                System.out.printf(". \n");
                
                
                
                leitor.close();
                
            
        }
        }
        