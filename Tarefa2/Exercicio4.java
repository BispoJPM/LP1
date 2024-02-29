package Tarefa2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner pct = new Scanner(System.in);

        float fab;

        System.out.print("Digite o custo de fábrica: ");
        fab = pct.nextFloat();

        float pd = fab * (45/100);
        float imp = fab * (28/100);
        float novo = fab + pd + imp;

        System.out.print("O valor do carro para o consumidor é de: R$" + novo + "\n");
    }
}
