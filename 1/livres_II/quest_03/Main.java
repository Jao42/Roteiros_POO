import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String palavra = "";
    String maior = "";
    String menor = "";

    int tamMaior = 0;
    int tamMenor = -1;

    Scanner entrada = new Scanner(System.in);

    int tamanho;

    System.out.print("Digite a primeira palavra: ");
    palavra = entrada.nextLine();
    while(!palavra.equals("")) {
      tamanho = palavra.length();
      if ((tamanho < tamMenor) || (tamMenor == -1)) {
        menor = palavra;
        tamMenor = tamanho;
      }
      if (tamanho > tamMaior) {
        maior = palavra;
        tamMaior = tamanho;
      }
      System.out.print("Digite a proxima palavra: ");
      palavra = entrada.nextLine();
    }

    System.out.printf("A maior palavra que voce digitou foi \"%s\"\n", maior);
    System.out.printf("A menor palavra que voce digitou foi \"%s\"\n",  menor);

  }
}
