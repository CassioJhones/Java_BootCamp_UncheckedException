import javax.swing.JOptionPane;
public class UncheckedException {
  public static void main(String[] args) {
    boolean EXECUCAO = true;
    do { //--Faça o DO enquanto execução for TRUE
      String A = JOptionPane.showInputDialog("Numerador: ");
      String B = JOptionPane.showInputDialog("Denominador: ");
  
      try { //--Possivelo local do erro a ser tratado
        int resultado = dividir(Integer.parseInt(A), Integer.parseInt(B));
        JOptionPane.showMessageDialog(null, "O Resultado é " + resultado, B, resultado);
        EXECUCAO=false; //--Encerra o programa
  
      } catch (NumberFormatException e) { //--erro tratado para nao parar o programa
        System.out.println("\n\t---ERRO TRATADO---");
        e.printStackTrace(); //--MOSTRA O ERRO APENAS NO CONSOLE
        JOptionPane.showMessageDialog(null, "Entrada Inválida, informe um número inteiro", "NÚMERO NECESSÁRIO",0);
  
      } catch(ArithmeticException e) {//--erro tratado para nao parar o programa
        System.out.println("\n\t---ERRO TRATADO---");
        e.printStackTrace(); //--MOSTRA O ERRO APENAS NO CONSOLE
        JOptionPane.showMessageDialog(null, "Não existe divisão por ZERO\n", "ERRO MATEMÁTICO",0);
  
      }
      
    } while (EXECUCAO);
    System.out.println("\t-FIM-");
  }

  // -- METODO PARA O CALCULO DA DIVISAO
  public static int dividir(int A, int B) {
    return A / B;
  }
}

//JOptionalPane exibe as janelas