public class Passaro extends Animal {
    private double envergaduraAsa;

    public Passaro(String nome, String habitat, int idade, double envergaduraAsa) {
        super(nome, habitat, idade);
        this.envergaduraAsa = envergaduraAsa;
    }

    public void emitirSom() {
        System.out.println(nome + " diz: Piu Piu!");
    }

    public void voar() {
        System.out.println(nome + " está voando com suas asas de " + envergaduraAsa + "cm!");
    }
}