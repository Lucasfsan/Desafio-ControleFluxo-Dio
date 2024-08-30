
import java.util.Scanner;

public class Contador {
  public static class ParametroInvalidoException extends Exception {
    public ParametroInvalidoException(String errorMessage) {
      super(errorMessage);
    }
  }  

  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Informe o primeiro número");
    int parametroUm = terminal.nextInt();
    System.out.println("Informe o segundo número maior que o primeiro");
    int parametroDois = terminal.nextInt();

    try {
      contar(parametroUm, parametroDois);
    } catch (ParametroInvalidoException erro) {
      System.err.println("Logical error: " + erro.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
    if (parametroUm > parametroDois) {
      throw new ParametroInvalidoException("O primeiro número deve ser menor que o segundo");
    }

    int contagem = parametroDois - parametroUm;
    for (int x = 0; x <= contagem; x++) {
      System.out.println("Imprimindo o número: " + x);
    }

    
  }
     }
