import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a senha: ");
    String senha = entrada.nextLine();
    int tamanho = senha.length();
    if ((tamanho < 5) ||
        (senha.toUpperCase().equals(senha) ||
         senha.toLowerCase().equals(senha))) {
      System.out.println("Senha fraca");
      System.exit(1);
    }

    boolean temNumero = false;
    String numeros = "123456789";
    char letra;
    for(int i = 0; i < senha.length(); i++) {
      letra = senha.charAt(i);
      for(int j = 0; j < numeros.length(); j++) {
        if (senha.charAt(i) == numeros.charAt(j)) {
          temNumero = true;
          break;
        }
      }
    }
    if(temNumero)
      System.out.println("Senha forte");
    else
      System.out.println("Senha fraca");

  }
}
