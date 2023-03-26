import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma = 0;
    int nota = 0;

    for(int i = 1; i <= 3; i++) {
      System.out.printf("Digite a %dº nota: ", i);
      nota = entrada.nextInt();
      if (nota > 100 || nota < 0) {
        System.out.println("\nErro! Você digitou uma nota inválida.\nDigite notas entre 0 e 100.");
        System.exit(1);
      }
      soma += nota;
    }
    double media = soma/3.0F;
    boolean aprov = media > 70;
    boolean reprov = media < 40;

    System.out.printf("\nSua media foi: %.2f\n", media);
    System.out.println("Você está " + 
        (aprov ? "aprovado": reprov ? "reprovado" : "em recuperacao") + 
        "."
        );
  }
}
