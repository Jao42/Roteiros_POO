import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a palavra em que deseja pesquisar: ");
    String palavra = entrada.next();
    System.out.print("Digite a letra que deseja procurar: ");
    char letra = entrada.next().charAt(0);

    int count = 0;
    for (int i = 0; i < palavra.length(); i++) {
      if (palavra.charAt(i) == letra) {
        count++;
        System.out.printf("Temos a letra \"%c\" no indice %d\n", letra, i);
        }
    }
    if (count == 0)
      System.out.println("Letra não encontrada na palavra!");
  }
}
