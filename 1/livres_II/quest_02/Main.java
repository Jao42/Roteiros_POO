import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int soma = 0;
    int num = -1;
    Scanner entrada = new Scanner(System.in);

    while (num != 0) {
      num = entrada.nextInt();
      soma += num;
    }
    System.out.println(soma);
  }
}
