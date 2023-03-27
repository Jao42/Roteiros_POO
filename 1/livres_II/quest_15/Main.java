import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double glic = 0;
    int quant = -1; //loop conta 1 vez a mais
    int somaGlic = 0;

    do {
      glic = entrada.nextDouble();
      somaGlic += glic;
      quant += 1;
    }
    while (glic != 0);

    double glicMedia = (double)somaGlic/quant;

    String msgNivelGlicose = (
        glicMedia > 200 ? "Muito Alta": 
        glicMedia < 110 ? "Normal" : 
        "Alterada"
        );
    System.out.println("Glicose " + msgNivelGlicose);

  }
}
