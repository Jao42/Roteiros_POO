import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma = 0;

    for(int i = 1; i <= 3; i++) {
      System.out.printf("Digite o %dº numero: ", i);
      soma += entrada.nextInt();

    }
    if((soma % 2) == 0)
      System.out.printf("\nA soma dos numeros eh par \n");
    else
      System.out.printf("\nA soma dos numeros eh impar \n");
  }
}
