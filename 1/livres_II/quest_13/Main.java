import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    int maior = 0;
    int menor = 0;
    for(int i = 1; i <= 10; i++) {
      System.out.printf("Digite o %dº numero: ", i);
      num = entrada.nextInt();
      if (num > maior)
        maior = num;
      if (num < menor || i == 1)
        menor = num;

    }
    System.out.printf("O menor valor lido foi %d\n", menor);
    System.out.printf("O maior valor lido foi %d\n", maior);
     
  }
}
