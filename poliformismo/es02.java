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

public class es02 {
    public static void main(String[] args) {
      
        Forma[] forme = { new Cerchio(5), new Rettangolo(4, 5) };
        
        
        for (Forma forma : forme) {
            System.out.println("Area: " + forma.calcolaArea());
        }
    }
}