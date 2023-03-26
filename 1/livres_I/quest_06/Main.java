import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double salario;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o seu salario: ");
    salario = entrada.nextDouble();
    System.out.print("Valor da prestacao do emprestimo: ");
    double prestacao = entrada.nextDouble();

    boolean concede = prestacao <= ((20/100.0F)*salario);
    System.out.println("Emprestimo " + (!(concede) ? "nao": "") + " concedido.");
  }
}
