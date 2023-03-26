class Main {
  public static void main(String[] args) {
    int somaMult3 = 0;

    for(int i = 1; i <= 100; i++) {
      if ((i % 3) == 0) {
        somaMult3 += i;
      }
      System.out.println(i);
    }

    System.out.printf("\nA soma dos multiplos de 3 eh: %d", somaMult3);

    //A quant de multiplos de 7 entre 1 e 100 eh "quantos 7 cabe" em 100
    //7=7*1, 14=7*2... 98=7*14
    //Ou seja, eh o quociente da divisao inteira
    System.out.printf("\nO total de multiplos de 7 eh: %d", (100/7));


  }
}
