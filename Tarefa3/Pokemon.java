public class Pokemon {
    // https://github.com/BispoJPM/LP1/assets/142633184/c3d2dd3a-9cde-4862-808b-9359579febb9

    private String tipo;
    private Double tamanho;
    private int nível;

    public String capturei(int quantas){
        return("Capturei " + quantas + " Pokemons");
    }

    public void avaliar(int estrelas){
        System.out.println("Ele é quantas estrelas?" + estrelas);
    }

    public boolean transferir(int av){
        boolean af=true;
        if(av%2==0) af=false;
        return af;
    }




}
