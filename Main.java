public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Cachorro", "Casa", 5, "ShiTzu");
        Animal animal2 = new Gato("Gato", "Apartamento", 3, true);
        Animal animal3 = new Passaro("Pássaro", "Floresta", 2, 15.5);

        chamarMetodosEspecificos(animal1);
        chamarMetodosEspecificos(animal2);
        chamarMetodosEspecificos(animal3);

        fazerAnimalEmitirSom(animal1);
        fazerAnimalEmitirSom(animal2);
        fazerAnimalEmitirSom(animal3);
    }

    public static void chamarMetodosEspecificos(Animal animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.abanarRabo();
        }
        else if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            gato.arranhar();
        }
        else if (animal instanceof Passaro) {
            Passaro passaro = (Passaro) animal;
            passaro.voar();
        }
    }

    public static void fazerAnimalEmitirSom(Animal animal) {
        animal.emitirSom();
    }
}