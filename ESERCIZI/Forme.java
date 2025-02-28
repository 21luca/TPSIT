abstract class Forma {
     abstract double calcolaArea();
}

class Cerchio extends Forma {
    private double raggio;
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    @Override
    double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}

class Rettangolo extends Forma {
    private double base, altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    @Override
    double calcolaArea() {
        return base * altezza;
    }
}

public class Forme {
    public static void main(String[] args) {
    Forma[] forme = { new Cerchio(3), new Rettangolo(1, 2) };
        for (Forma forma : forme) {
            System.out.println("Area: " + forma.calcolaArea());
        }
    }
}
