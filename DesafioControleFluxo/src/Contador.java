
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Por favor, informe o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Por favor, informe o segundo número maior que o primeiro:");
        int parametroDois = terminal.nextInt();
   
        try {
              contar(parametroUm, parametroDois);
        } catch ( ParametrosInvalidosException e){
         System.out.println("O primeiro número deve ser menor que o segundo");
        }
     }
     static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
       if (parametroUm > parametroDois){
         throw new ParametrosInvalidosException();
       }
       else{
       int contagem = parametroDois - parametroUm;
       }
        for (int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Imprimindo o número: " + i);
          }
     }
    }
    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String errorMessage) {
            super(errorMessage);
      }
     }
