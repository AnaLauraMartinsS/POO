package Animais;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void mia(){
        System.out.println("O "+ this.getNome() + " está miando feito doido");
    }

    public void dormir(){
        System.out.println("O "+ this.getNome() + " após miar feito doido está dormindo");
    }

    public void banho(){
        System.out.println("O "+ this.getNome()+ " tomou banho");
    }
    public void idade(){
        System.out.println("E este: "+ getNome()+ " tem " + this.getIdade() + " anos");
    }
}
