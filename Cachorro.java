public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String habitat, int idade, String raca) {
        super(nome, habitat, idade);
        this.raca = raca;
    }

    public void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo feliz!");
    }
}