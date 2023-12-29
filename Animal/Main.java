package Animal;
public class Main {
    public static void main (String[] args){

        System.out.println("==== MAMIFERO ====");
        Mamifero m = new Mamifero();
        m.reproducao();
        m.alimentar();
        m.cacar();
        m.setPelagem("Cores variadas dependendo da espécie de mamífero");


        Chinchila c = new Chinchila();
        System.out.println("==== CHINCHILA ====");
        c.setNome("Chinchila lanigera");
        c.setIdade(5);
        c.setSexo('M');
        c.setPeso(0.500f);
        c.reproducao();
        c.alimentar();
        c.cacar();
        c.setPelagem("Cinza");
        System.out.println(c.toString());

        Cagado ca = new Cagado();
        System.out.println("==== CAGÁDO ====");
        ca.setNome("Phrynops geofroanus");
        ca.setIdade(17);
        ca.setSexo('F');
        ca.setPeso(1.700f);
        ca.reproducao();
        ca.alimentar();
        ca.cacar();
        ca.setSangueFrio("Sou um animal de sangue frio");
        System.out.println(ca.toString());

        Ema e = new Ema();
        System.out.println("==== EMA ====");
        e.setNome("Rhea americana");
        e.setIdade(10);
        e.setSexo('F');
        e.setPeso(25f);
        e.reproducao();
        e.alimentar();
        e.cacar();
        e.setPenas("Possuo penas cinzas claras");
        e.setBico("E bico comprido");
        System.out.println(e.toString());

    }
}
