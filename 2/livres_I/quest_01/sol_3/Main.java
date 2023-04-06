import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String pattern = "dd/MM/yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    System.out.print("Digite sua data de nascimento(formato: dd/mm/aaaa): ");
    
    LocalDate dataNasc = LocalDate.parse(entrada.nextLine(), formatter);
    LocalDate dataAtual = LocalDate.now();
    LocalDate tempData = LocalDate.from(dataNasc);

    long idade = ChronoUnit.YEARS.between(dataNasc, dataAtual);

    System.out.printf("Então sua idade eh de %d anos\n", idade);
  }
}
