class Forme {
    private String nome;

    public Forme(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("forma: " + nome);
    }
}

class Cerchio extends Forme {
    private double raggio;

    public Cerchio(double raggio) {
        super("cerchio");
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return raggio * raggio * Math.PI;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}

class Rettangolo extends Forme {
    private double base, altezza;

    public Rettangolo(double base, double altezza) {
        super("rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Triangolo extends Forme {
    private double base, altezza, lato1, lato2, lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        super("triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}

public class TestFormeMain {
    public static void main(String[] args) {
        Forme oggForme= new Forme("nome forme:");
        oggForme.calcolaArea();
        oggForme.calcolaPerimetro();
        oggForme.descrizione();

        Cerchio cerchio = new Cerchio(2);
        cerchio.calcolaArea();
        cerchio.calcolaPerimetro();
        cerchio.descrizione();

        Rettangolo rettangolo = new Rettangolo(3);
        rettangolo.calcolaArea();
        rettangolo.calcolaPerimetro();
        rettangolo.descrizione();
        };

        double areaTotale = 0, perimetroTotale = 0;

        for (Forme forma : forme) {
            forma.descrizione();
            System.out.println("area: " + forma.calcolaArea());
            System.out.println("perimetro: " + forma.calcolaPerimetro());
            System.out.println();
            areaTotale += forma.calcolaArea();
            perimetroTotale += forma.calcolaPerimetro();
        }

        System.out.println("area tot: " + areaTotale);
        System.out.println("perimetro tot: " + perimetroTotale);
    }


class TestForme {
    public static void main(String[] args) {
        Forme forma = new Cerchio(7);
        forma.descrizione();
        System.out.println("area: " + forma.calcolaArea());
        System.out.println("perimetro: " + forma.calcolaPerimetro());
    }
}