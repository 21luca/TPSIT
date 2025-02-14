import java.util.ArrayList;

class ProdottoElettronico {

    String nome;
    double prezzo;

    public ProdottoElettronico(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void stampaDettagli() {
        System.out.println("nome: " + nome + ", prezzo: " + prezzo);
    }
}

class Smartphone extends ProdottoElettronico {
    String marca;
    int memoria;

    public Smartphone(String nome, double prezzo, String marca, int memoria) {
        super(nome, prezzo);  
        this.marca = marca;
        this.memoria = memoria;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("nome: " + nome + ", prezzo: " + prezzo + ", marca: " + marca + ", memoria: " + memoria + "GB");
    }
}

class Televisore extends ProdottoElettronico {
    
    int dimensioneSchermo;
    String risoluzione;

    public Televisore(String nome, double prezzo, int dimensioneSchermo, String risoluzione) {
        super(nome, prezzo);  
        this.dimensioneSchermo = dimensioneSchermo;
        this.risoluzione = risoluzione;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("nome: " + nome + ", prezzo: " + prezzo + ", dimensione: " + dimensioneSchermo + "\", risoluzione: " + risoluzione);
    }
}

class GestioneNegozioElettronico{
    private ArrayList<ProdottoElettronico> prodotti;

    public GestioneNegozioElettronico() {
        prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(ProdottoElettronico prodotto) {
        prodotti.add(prodotto);
    }

    public void stampaProdotti() {
        for (ProdottoElettronico prodotto : prodotti) {
            prodotto.stampaDettagli();
        }
    }

    public double calcolaTotale() {
        double totale = 0.0;
        for (ProdottoElettronico prodotto : prodotti) {
            totale += prodotto.prezzo;
        }
        return totale;
    }
}

public class GestioneNegozioElettronicoMain {
    public static void main(String[] args) {
     
        Smartphone smartphone = new Smartphone("iphone", 1200.0, "apple", 256);
        Televisore televisore = new Televisore("samsung tv", 950.0, 70, "4k");

        GestioneNegozioElettronico negozio = new GestioneNegozioElettronico();
        
   
        negozio.aggiungiProdotto(smartphone);
        negozio.aggiungiProdotto(televisore);
        
        negozio.stampaProdotti();


        System.out.println("totale: " + negozio.calcolaTotale());
    }
}
