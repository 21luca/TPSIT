class Auto {
    String modello;
    int posti;

    Auto(String modello, int posti) {
        this.modello = modello;
        this.posti = posti;
    }
}

public class es02 {
    public static void main(String[] args) {
        Auto[] automobili = {
            new Auto("500 Abarth", 4),
            new Auto("Fiat Multipla", 6),
            new Auto("Toyota Sienna", 7),
            new Auto("Volkswagen Touran", 7),
            new Auto("Kia Sportage", 5)
        };

        for (Auto auto : automobili) { 
            if (auto.posti == 7) System.out.println(auto.modello);
        }
    }
}

