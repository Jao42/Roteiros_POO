import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double num;
    boolean todosPositivos = true;
    Scanner entrada = new Scanner(System.in);

    for(int i = 1; i <= 3; i++) {
      System.out.printf("Digite o %dº valor: ", i);
      num = entrada.nextDouble();
      if (num <= 0)
        todosPositivos = false;
    }
    if (todosPositivos)
      System.out.println("Sao todos positivos");
    else
      System.out.println("Nem todos sao positivos");
  }
}
