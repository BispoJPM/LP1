package Tarefa2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner horas = new Scanner(System.in);

        float hi;
        float hf;

        System.out.println("Digite a hora inicial: ");
        hi = horas.nextFloat();
        System.out.println("Digite a hora final: ");
        hf = horas.nextFloat();

        float duracao;
        if (hi <= hf) {
            duracao = hf - hi;
        } else {
            duracao = 24 - hi + hf;
            System.out.println("A duração do jogo foi de " + duracao + " horas.");
        }
    }
}
