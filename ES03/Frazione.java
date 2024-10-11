public class Frazione {
    // Campi
    private int numeratore;
    private int denominatore;
    // Costruttore

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    // Metodo per ottenere il numeratore
    public int getNumeratore() {
        return numeratore;
    }

    // Metodo per ottenere il denominatore
    public int getDenominatore() {
        return denominatore;
    }

    // Metodo per ottenere la rappresentazione testuale della frazione
    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    // Metodo per sommare due frazioni
    public Frazione somma(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                + altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public static void main(String[] args) {
        Frazione f1 = new Frazione(2,3);
        Frazione f2 = new Frazione(5, 6);
        Frazione f3 = new Frazione(3, 4);

        System.out.println(f1.toString()); 
        System.out.println(f2.toString()); 
        System.out.println(f3.toString()); 

        f1.somma(f3);
        System.out.println(f1.toString());

        f1.somma(f2);
        System.out.println(f1.toString());

        
    }
}
