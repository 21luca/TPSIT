interface Forma2D {
    double calcolaArea();
    double calcolaPerimetro();
}

interface Forma3D {
    double calcolaVolume();
    double calcolaSuperficie();
}

class Cerchio implements Forma2D {
    private double raggio;
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    
    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}


class Rettangolo implements Forma2D {
    private double larghezza, altezza;

    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return larghezza * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }
}

class Sfera implements Forma3D {
    private double raggio;

    public Sfera(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raggio, 3);
    }

    @Override
    public double calcolaSuperficie() {
        return 4 * Math.PI * Math.pow(raggio, 2);
    }
}

class Cubo implements Forma3D {
    private double larghezza, altezza, profondita;

    public Cubo(double larghezza, double altezza, double profondita) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    @Override
    public double calcolaVolume() {
        return larghezza * altezza * profondita;
    }

    @Override
    public double calcolaSuperficie() {
        return 2 * (larghezza * altezza + larghezza * profondita + altezza * profondita);
    }
}

class CalcolatoreGeometrico {
    public void stampaProprietaForma2D(Forma2D forma) {
        System.out.println("area: " + forma.calcolaArea());
        System.out.println("perimetro: " + forma.calcolaPerimetro());
    }

    public void stampaProprietaForma3D(Forma3D forma) {
        System.out.println("volume: " + forma.calcolaVolume());
        System.out.println("superficie: " + forma.calcolaSuperficie());
    }
}

public class Forme {
    public static void main(String[] args) {
        CalcolatoreGeometrico calcolatore = new CalcolatoreGeometrico();

        Forma2D cerchio = new Cerchio(5);
        Forma2D rettangolo = new Rettangolo(4, 6);
        Forma3D sfera = new Sfera(3);
        Forma3D cubo = new Cubo(2, 3, 4);

        System.out.println("dati del cerchio:");
        calcolatore.stampaProprietaForma2D(cerchio);
        
        System.out.println("\ndati del rettangolo:");
        calcolatore.stampaProprietaForma2D(rettangolo);
        
        System.out.println("\ndati della sfera:");
        calcolatore.stampaProprietaForma3D(sfera);
        
        System.out.println("\ndati del cubo:");
        calcolatore.stampaProprietaForma3D(cubo);
    }
}
 