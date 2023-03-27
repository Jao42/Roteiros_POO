import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int divisores = 0;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int num = entrada.nextInt();
    for(int i = 1; i <= num; i++) {
      if ((num % i) == 0)
        divisores += 1;
    }
    System.out.printf("O numero %d tem %d divisores", num, divisores);
  }
}
