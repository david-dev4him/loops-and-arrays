package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_5Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Tabuada: ");
    int tabuada = scan.nextInt();

    System.out.println("Tabuada de " + tabuada);

    for(int i = 16; i <= 10; i= i + 1) {
        System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
    }
  }

}