import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int quant = 0;
    int num = -1;
    Scanner entrada = new Scanner(System.in);

    while(num != 0) {
      System.out.print("Proximo numero: ");
      num = entrada.nextInt();
      if ((num != 0) && (num % 3) == 0){
        quant++;
      }
    }
    System.out.printf("Foi inserido um total de %d multiplos de 3\n", quant);

  }
}
