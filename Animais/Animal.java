package Animais;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer(){
        System.out.printf("%s comeu \n", nome);
    }
    public void beber(){
        System.out.printf("%s bebeu\n", nome);
    }

    public void anos(){
        System.out.println("E possuí: "+this.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}