public class Chá {
    // https://github.com/BispoJPM/LP1/assets/142633184/23cbc9f8-1b2f-4b69-a1f5-5362c1056096

    private String nome;
    private int temperatura;
    private String cheiro;

    public String tomar(int chas){
        return("\n" + "Eu tomei " + chas + "chás");
    }
    public void ferver(String como){
        System.out.print("Esse chá foi feito usando " + como);
    }
    public String colher(String horario){
        return("Eu colhi esse chá de: " + horario);
    }

}
