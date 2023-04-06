import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int count = 0;

    for (String valor = entrada.nextLine(); 
        !(valor.equals("sair")); 
        valor = entrada.nextLine())
      if (valor.equals("oi"))
        count++;

    System.out.printf("Foi digitado %d vezes a palavra \"oi\"\n", count);

  }
}
