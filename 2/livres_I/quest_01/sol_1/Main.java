import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite sua data de nascimento(formato: dd/mm/aaaa): ");
    String dataNasc = entrada.nextLine();
    System.out.print("Digite a data atual(formato: dd/mm/aaaa): ");
    String dataAtual = entrada.nextLine();

    String valDataNasc[] = dataNasc.split("/");
    String valDataAtual[] = dataAtual.split("/");
    int intValDataNasc[] = new int[3];
    int intValDataAtual[] = new int[3];
    for(int i = 0; i < 3; i++) {
      intValDataNasc[i] = Integer.parseInt(valDataNasc[i]);
      intValDataAtual[i] = Integer.parseInt(valDataAtual[i]);
    }

    int idade = intValDataAtual[2] - intValDataNasc[2]; 
    if ((intValDataNasc[1] > intValDataAtual[1]) ||
        ((intValDataNasc[1] == intValDataAtual[1]) && 
         intValDataNasc[0] > intValDataAtual[0])) {
          idade--;
         }
    System.out.printf("Então sua idade eh de %d anos\n", idade);
  }
}
