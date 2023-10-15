package Animais;

public class Cachorro extends Animal{


    public Cachorro(String nome, int idade) {
        super (nome, idade);
    }

    public void latir(){
        System.out.println("O " + this.getNome() + "  está latindo");
    }

    public void cavar(){
        System.out.println("O " +this.getNome()+ " fez um buraco no Jardim");
    }
    public void idade(){
        System.out.println("E possuí "+ this.getIdade() + " anos");
    }
}
