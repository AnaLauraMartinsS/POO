package Animais;

import javax.sound.midi.Soundbank;

public class Chinchila extends Animal{
    private int uvaPassa;


    public Chinchila(String nome, int idade) {
        super("Dipper", 5);
        this.uvaPassa = 2;
    }
    public void roer(){
        System.out.println("O "+ getNome() +" por ser um roedor, sempre precisa estar roendo algo");
    }
    public void bagunca(){
        System.out.println("O "+getNome()+ " por ser de habitos noturnos, a noite faz bagunça");
    }

    public void idade() {
        System.out.println("E possuí: "+ getIdade() + " anos");
    }

    public void guloseimas(){
        System.out.println("E hoje ele comeu: "+ this.uvaPassa + " uvas passas como sobremesa");
    }
}
