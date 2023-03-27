import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma;
    double media;
    for(int i = 1; i <= 4; i++) {
      media = 0;
      soma = 0;
      for(int j = 1; j <= 2; j++) {
        System.out.printf("Digite a %dª nota do %dº aluno: ", j, i);
        soma += entrada.nextInt();
      }
      media = soma / 2.0F;
      System.out.printf("A media %dº aluno eh %.2f\n\n", i, media);
    }
  }
}
