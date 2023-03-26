import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o coeficiente de x²: ");
    double a = entrada.nextDouble();
    System.out.print("Digite o coeficiente x: ");
    double b = entrada.nextDouble();
    System.out.print("Digite o termo independente: ");
    double c = entrada.nextDouble();
    double raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
    double raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
    System.out.printf("As raizes da funcao quadratica com a = %.2f, b = %.2f e c = %.2f sao:\n", a, b, c);
    System.out.printf("x' = %.2f\n", raiz1);
    System.out.printf("x'' = %.2f\n", raiz2);
  }
}
