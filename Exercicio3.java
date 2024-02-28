import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args){
                
        Scanner nota = new Scanner(System.in);

        float P1;
        float E1;
        float E2;
        float API;
        float SUB;
        float X;
        float LP1; 

        System.out.print("Digite a nota da prova: ");
        P1 = nota.nextFloat();
        System.out.print("Digite a nota da Atividade 1: ");
        E1 = nota.nextFloat();
        System.out.print("Digite a nota da Atividade 2: ");
        E2 = nota.nextFloat();
        System.out.print("Digite a nota da API: ");
        API = nota.nextFloat();
        System.out.print("Digite a nota da prova substitutiva: ");
        SUB = nota.nextFloat();
        System.out.println("Digite os pontos a mais X: ");
        X = nota.nextFloat();
        
        LP1 = (float)((p1*0.6+(((e1+e2)/2)* 0.4)) * 0.5 + (Math.max(((p1*0.6+((e1+e2)/2)*0.4)-5.9), 0)/((p1*0.6+((e1+e2)/2)*0.4)-5.9))*(api*0.5)+x+(sub*0.2));
        
        if(lp1 > 10){
            System.out.println("Execute o programa novamente e verifique as notas! (O resultado foi acima de 10,00)");
        }else{
            System.out.println("Sua média é " + lp1);
        }
        
    }   
    
}
