package Tarefa2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner revendedora = new Scanner(System.in);

        int carros;
        float vendas;
        float salf;
        float comfx;
        
        System.out.print("Digite a quantidade de carros vendidos: ");
        carros = revendedora.nextInt();
        System.out.print("Digite o valor total das vendas: ");
        vendas = revendedora.nextFloat();
        System.out.print("Digite o salário fixo: ");
        salf = revendedora.nextFloat();
        System.out.print("Digite o valor da comissão fixa: ");
        comfx = revendedora.nextFloat();

        float comissao = (vendas * 5/100);
        float comissaofixa = (carros * (comfx/100)) * vendas;
        float salfinal = salf + comissao + comissaofixa;

        System.out.print("O salário final do vendedor é de: " + salfinal);

    }
}
