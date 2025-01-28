class Veicoli {
    String marca;
    String modello;

    public Veicoli(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public void stampaDettagli() {
        System.out.println("la marca e': " + marca);
        System.out.println("il modello e': " + modello);
    }
}

public class VeicoliMain {
    public static void main(String[]args){
        Veicoli ferrari = new Veicoli("ferrari","sf90");
        Veicoli nissan = new Veicoli("nissan", "gtr");

        System.out.println("dettagli: ");
        ferrari.stampaDettagli();
        System.out.println();
        nissan.stampaDettagli();
    }
}