import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    int maior = 0;

    for(int i = 1; i <= 3; i++) {
      System.out.printf("Digite o %dº numero: ", i);
      num = entrada.nextInt();
      if (i == 1 || num > maior)
        maior = num;
    }
    System.out.printf("\nO maior numero inserido eh o %d\n", maior);
  }
}
