    import java.util.Scanner;import java.util.Scanner;

    public class Ex12 {
        
        public static void executar(){
    
            Scanner leitor = new Scanner (System.in);     
                
            Double[] vetorA = new Double[12];
            int produto = 1;       
             
            
            for (int i = 0; i < vetorA.length; i++){
    
                System.out.printf("Digite o número %d do vetorA: ", i + 1 ); 
                vetorA[i] = leitor.nextDouble();
    
            }                         
    
            
    
            for ( int i = 0; i < vetorA.length; i++){
    
                if (vetorA[i] > 0 && vetorA[i] != 0 && vetorA[i] % 2 == 0) {


                    System.out.println(""+vetorA[i]);
                    produto *= vetorA[i];

                }
    
            }        

            System.out.println("Resultado: " + produto);
            
            leitor.close();
            
        
    }
    }
    
