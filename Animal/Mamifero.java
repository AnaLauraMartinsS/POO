package Animal;

public class Mamifero extends Animal{
    private String pelagem;

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public void alimentar() {
        System.out.println("A maioria dos mamíferos ao nascerem se alimentam mamando.");
    }

    @Override
    public void cacar() {
        System.out.println("Caçando");
    }

    @Override
    public void reproducao() {
        System.out.println("Se reproduzir para perpetuar a espécie.");
    }

    @Override
    public String toString() {
        return "Mamifero{" + super.toString() +
                "pelagem='" + pelagem + '\'' +
                '}';
    }
}
