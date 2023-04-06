import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int count = 0;

    for (String valor = entrada.nextLine().toLowerCase(); 
        !(valor.equals("sair")); 
        valor = entrada.nextLine().toLowerCase())
      if (valor.startsWith("m"))
        count++;

    System.out.printf("Foi digitado %d vezes palavras que comecam com a letra \"m\"\n", count);

  }
}
