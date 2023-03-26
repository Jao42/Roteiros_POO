import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    int menor = 0;

    for(int i = 1; i <= 3; i++) {
      System.out.printf("Digite o %dº numero: ", i);
      num = entrada.nextInt();
      if (i == 1 || num < menor)
        menor = num;
    }
    System.out.printf("\nO menor numero inserido eh o %d\n", menor);
  }
}
