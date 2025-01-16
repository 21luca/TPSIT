import java.util.Scanner;

class Prodotto {
    private int quantita;
    private String nome;
    private double prezzo;
        public void setNome(String nome) { this.nome = nome; }
        public String getNome() { return nome; }
        public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
        public double getPrezzo() { return prezzo; }
        public void setQuantita(int quantita) { this.quantita = quantita; }
        public int getQuantita() { return quantita; }
        public double calcolaValoreTotale() {
            return prezzo * quantita;
        }
}

public class esercizio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prodotto p = new Prodotto();
        System.out.print("inserire nome prodotto: ");
        p.setNome(sc.nextLine());
        System.out.print("inserire prezzo prodotto: ");
        p.setPrezzo(sc.nextDouble());
        System.out.print("inserire quantità prodotto: ");
        p.setQuantita(sc.nextInt());
        System.out.println("nome: " + p.getNome());
        System.out.println("prezzo: " + p.getPrezzo());
        System.out.println("quantità: " + p.getQuantita());
        System.out.println("totale: " + p.calcolaValoreTotale());

        sc.close();
    }
}

