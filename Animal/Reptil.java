package Animal;

import javax.sound.midi.Soundbank;

public class Reptil extends Animal{
    private String sangueFrio;


    public String getSangueFrio() {
        return sangueFrio;
    }

    public void setSangueFrio(String sangueFrio) {
        this.sangueFrio = sangueFrio;
    }

    @Override
    public void alimentar() {
        System.out.println("Estou comendo.");
    }

    @Override
    public void cacar() {
        System.out.println("Estou procurando o que comer");
    }

    @Override
    public void reproducao() {
        System.out.println("Se reproduzir para perpetuar a espécie.");
    }

    @Override
    public String toString() {
        return "Reptil{" + super.toString() +
                "sangueFrio='" + sangueFrio + '\'' +
                '}';
    }
}
