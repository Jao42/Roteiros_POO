import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o coeficiente angular: ");
    double a = entrada.nextDouble();
    System.out.print("Digite o coeficiente linear: ");
    double b = entrada.nextDouble();
    double raiz = -b/a;
    System.out.printf("A raiz da funcao linear de coef. ang. = %.2f e coenf. lin. = %.2f eh: \n", a, b);
    System.out.printf("x = %.2f\n", raiz);
  }
}
