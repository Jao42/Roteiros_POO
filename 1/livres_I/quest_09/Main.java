import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String msg = "";
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite seu peso(em quilos): ");
    double peso = entrada.nextDouble();
    System.out.print("Digite sua altura(em metros): ");
    double altura = entrada.nextDouble();

    double imc = peso/Math.pow(altura, 2);
    if (imc >= 40)
      msg = "Obesidade grau III";
    else if (imc >= 35)
      msg = "Obesidade grau II";
    else if (imc >= 30)
      msg = "Obesidade grau I";
    else if (imc >= 25)
      msg = "Você está acima de seu peso (sobrepeso)";
    else if (imc >= 18.5)
      msg = "Parabéns — você está em seu peso normal!";
    else if (imc < 18.5)
      msg = "Você está abaixo do peso ideal";
    System.out.println(msg);
    System.out.println(imc);
  }
}

