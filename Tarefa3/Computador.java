public class Computador {

    // https://github.com/BispoJPM/LP1/assets/142633184/9057e1a0-75a9-4b62-97cd-cd745d947c80

    private String marca;
    private int memoria;
    private int monitores;

    public String jogar(double horas){
        return("\n" + "Eu passei " + horas + "horas jogando");
    }
    public String ligar(int velocidade){
        return("De 0 a 10, o pc liga quão rapido? 0 - muito lento / 10 - muito rapido: " + velocidade);
    }
    
    
}