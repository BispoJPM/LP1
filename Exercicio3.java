package Ling_Prog;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;

        System.out.println("Digite a primeira nota: ");
        nota1 = notas.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = notas.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = notas.nextFloat();

        float media = nota1 + nota2 + nota3;
        float media1 = media/= 3;

        System.out.println("\n" +"A média desse aluno foi: " + media1 + "\n");

    }
}
