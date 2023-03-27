import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o numero: ");
    int num = entrada.nextInt();

    if (num < 0)
      for(; num <= 0; num++)
        System.out.println(num);
    else
      for(; num >= 0; num--)
        System.out.println(num);
    
  }
}
