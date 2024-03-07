public class Coxinha {

    // Link: https://github.com/BispoJPM/LP1/assets/142633184/6cc82eeb-07a5-4114-9b41-9cd49aebed51

    private String receita;
    private String tamanho;
    private String recheio;

        
    public String comer(int quantas){
        return("\n"+"Comi " + quantas + " Coxinhas"+"\n");
    }

    public String armazenagem(String tipo){
        return ("Armazenagem " + tipo);
    }
   
    public void assar(String como){
        System.out.println("Estou assando " + como);
    }

    public static void main(String[] args) {
        Coxinha c1;
        c1 = new Coxinha();
        c1.receita="Massa_de_mandioca";
        c1.tamanho= "Médio";
        c1.recheio= "Frango";
        System.out.println(c1.comer(5));
        System.out.println(c1.armazenagem("Congelei"));



    }

    }

