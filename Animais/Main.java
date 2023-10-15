package Animais;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main (String[] args){
        Cachorro c = new Cachorro(" Robertinho", 4);
        System.out.println("---- CACHORRO -----");
        c.latir();
        c.cavar();
        c.idade();
        c.comer();
        c.beber();

        Gato g = new Gato(" Miauzinho", 10);
        System.out.println("----- GATO -----");
        g.mia();
        g.banho();
        g.dormir();
        g.idade();
        g.comer();
        g.beber();

        Chinchila c1 = new Chinchila(" Dipper", 5);
        System.out.println("----- CHINCHILA ----- ");
        c1.roer();
        c1.bagunca();
        c1.idade();
        c1.guloseimas();
        c1.beber();
        c1.comer();
    }
}
