public class Gato extends Animal {
    private boolean ehDomestico;

    public Gato(String nome, String habitat, int idade, boolean ehDomestico) {
        super(nome, habitat, idade);
        this.ehDomestico = ehDomestico;
    }

    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    public void arranhar() {
        System.out.println(nome + " está arranhando o sofá!");
    }
}