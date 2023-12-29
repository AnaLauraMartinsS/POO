package Animal;

public class Ave extends Animal{
    private String penas;

    private String bico;

    public void ninho(){

    }

    public String getPenas() {
        return penas;
    }

    public void setPenas(String penas) {
        this.penas = penas;
    }

    public String getBico() {
        return bico;
    }

    public void setBico(String bico) {
        this.bico = bico;
    }

    @Override
    public void alimentar() {
        System.out.println("Estou procurando alimento.");
    }

    @Override
    public void cacar() {
        System.out.println("Estou a procura do meu alimento");
    }

    @Override
    public void reproducao() {
        System.out.println("Se reproduzir para perpetuar a espécie.");
    }

    @Override
    public String toString() {
        return "Ave{" + super.toString() +
                "penas='" + penas + '\'' +
                ", bico='" + bico + '\'' +
                '}';
    }
}
