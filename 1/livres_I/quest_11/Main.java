import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a idade do nadador que você deseja saber a categoria: ");
    int idade = entrada.nextInt();
    String classif = "";
    if (idade >= 18 && idade <= 120)
      classif = "Adulto";
    else if (idade >= 14)
      classif = "Juvenil B";
    else if (idade >= 11) 
      classif = "Juvenil A";
    else if (idade >= 8) 
      classif = "Infantil B";
    else if (idade >= 5) 
      classif = "Infantil A";
    else if (idade >= 0)
      classif = "Sem classificacao";
    else
      classif = "Idade inválida!";
    System.out.println(classif);
    
  }
}
