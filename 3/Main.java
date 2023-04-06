import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //quest 1
    Scanner entrada = new Scanner(System.in);
    int[] valores = new int[5];
    
    System.out.print("Digite 5 inteiros positivos: ");
    for (int i = 0; i < 5; i++) {
      valores[i] = entrada.nextInt();
    }

    //quest 2 e 3
    System.out.print("Digite um valor para ser buscado: ");
    int valor = entrada.nextInt();
    int indice = -1;
    for(int i = 0; i < valores.length; i++) {
      if (valor == valores[i]) {
        indice = i;
        break;
      }
    }
    if (indice == -1)
      System.out.printf("\nO valor %d nao foi encontrado\n", valor);
    else
      System.out.printf("\nO valor %d foi encontrado no indice %d\n", valor, indice);

    //questao 4
    valores[0] = -1;
    System.out.println("Trocando o elemendo do indice 0 por -1");

    //questao 5
    int min = valores[0];
    int max = valores[0];
    int atual;
    for(int i = 1; i < valores.length; i++) {
      atual = valores[i];
      if (atual < min)
        min = atual;
      if (atual > max)
        max = atual;
    }

    System.out.printf("O valor maximo do array eh %d e o minimo eh %d\n", max, min);
    //questao 6
    System.out.println("Mostrando os elementos na ordem inversa: ");
    for(int i = valores.length - 1; i >= 0; i--)
      System.out.printf("%d ", valores[i]);
    System.out.println();
  }
}
