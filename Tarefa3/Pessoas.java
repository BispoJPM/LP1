public class Pessoas {
    // https://github.com/BispoJPM/LP1/assets/142633184/af65d10c-164b-4703-b1af-f9f4e00945c1

    private String nome;
    private double altura;
    private String cabelo;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }
    public String getNome() {
        return nome;
    }
    public double getAltura() {
        return altura;
    }
    public String getCabelo() {
        return cabelo;
    }
    public String andar(int andei){
        return("Hoje eu andei " + " metros");
    }
    public String aguar(int sera){
        return("Hoje eu aguei " + " para diferentes tipos de comida");
    }
    public void pagar(int pagamento){
        System.out.println("Eu paguei " + pagamento + "em um prato feito no restaurante");
    }
    }

