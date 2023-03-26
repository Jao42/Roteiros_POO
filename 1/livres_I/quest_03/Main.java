import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.printf("Digite um numero: ");
    int num = entrada.nextInt();

    if((num % 2) == 0)
      System.out.printf("\nO numero dos numeros eh par \n");
    else
      System.out.printf("\nO numero dos numeros eh impar \n");
  }
}
