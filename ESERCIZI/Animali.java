abstract class Animale {
    abstract void emettiVerso();
    void dormi() {
        System.out.println("zzz.....");
    }
}

class Cane extends Animale {
    @Override
    void emettiVerso() {
        System.out.println("bau");
    }
}

class Gatto extends Animale {
    @Override
    void emettiVerso() {
        System.out.println("miao");
    }
}

public class Animali {
    public static void main(String[] args) {
       Animale[] animali = { new Cane(), new Gatto(), new Cane() };
       for (Animale animale : animali) {
            animale.emettiVerso();
        }
    }
}