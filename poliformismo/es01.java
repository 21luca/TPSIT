abstract class Animale {
    // Metodo astratto da implementare nelle sottoclassi
    abstract void emettiVerso();
    
    // Metodo concreto
    void dormi() {
        System.out.println("Zzz...");
    }
}

class Cane extends Animale {
    @Override
    void emettiVerso() {
        System.out.println("Bau!");
    }
}

class Gatto extends Animale {
    @Override
    void emettiVerso() {
        System.out.println("Miao!");
    }
}

public class es01 {
    public static void main(String[] args) {
        // Creazione di un array di tipo Animale contenente cani e gatti
        Animale[] animali = { new Cane(), new Gatto(), new Cane() };

        // Iterazione sull'array e invocazione del metodo emettiVerso
        for (Animale animale : animali) {
            animale.emettiVerso();
        }
    }
}