package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_6Fatorial {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Fatorial: ");
      int fatorial = scan.nextInt();

      int multiplicacao = 1;

      System.out.print(fatorial + "! = ");
      for(int 1 = fatorial; i>= 1; i--) {
          multiplicacao = multiplicacao * i;
      }

      
  }
}
