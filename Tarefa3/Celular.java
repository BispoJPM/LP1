public class Celular {
    // https://github.com/BispoJPM/LP1/assets/142633184/37c6e0a0-c167-4be9-91d7-56462a0b8fd3

    private String marca;
    private int cameras;
    private String cor;

    public String getMarca() {
        return marca;
    }
    public int getCameras() {
        return cameras;
    }
    public String getCor() {
        return cor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCameras(int cameras) {
        this.cameras = cameras;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String possuir (int quantos){
        return("\n" + "Eu tenho " + quantos + "celulares");
    }
    public void quebrei (int serio){
        System.out.println("\n" + "Infelizmente eu quebrei " + serio + "celulares");
    }
    public boolean fotografar (String ab){
    boolean ac = true;
    if(ab=="nao") ac = false;
    return ac;
    }
}
