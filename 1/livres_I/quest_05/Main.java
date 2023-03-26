import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um ano: ");
    int ano = entrada.nextInt();

    if (((ano % 400) == 0) || (((ano % 4) == 0) && ((ano % 100) != 0)))
      System.out.printf("%d eh bissexto\n", ano);
    else
      System.out.printf("%d nao eh bissexto\n", ano);
  }
}
