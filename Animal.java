public class Animal {
    protected String nome;
    protected String habitat;
    protected int idade;

    public Animal() {
        this.nome = "Sem nome";
        this.habitat = "Desconhecido";
        this.idade = 0;
    }

    public Animal(String nome, String habitat, int idade) {
        this.nome = nome;
        this.habitat = habitat;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som genérico.");
    }
}