import java.util.Scanner;

class Studente {
    private String nome = "sconosciuto", cognome = "sconosciuto";
    private double mediaVoti = 0.0;
    private int numeroVoti = 0;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome.isEmpty() ? "sconosciuto" : nome; }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome.isEmpty() ? "sconosciuto" : cognome; }

    public double getMediaVoti() { return mediaVoti; }
    public void setMediaVoti(double voto) {
        if (voto >= 0 && voto <= 10) {
            mediaVoti = ((mediaVoti * numeroVoti) + voto) / (++numeroVoti);
        } else {
            System.out.println("valutazione non accettabile, deve essere compresa tra 0 e 10.");
        }
    }

    public void stampaDettagli() {
        System.out.println(getNome() + " " + getCognome() + ", media: " + getMediaVoti());
    }
}

public class esstud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studente s = new Studente(); // Spostato correttamente

        System.out.print("inserire nome: ");
        s.setNome(scanner.nextLine());
        System.out.print("inserire cognome: ");
        s.setCognome(scanner.nextLine());

        System.out.print("inserire numero di voti da assegnare: ");
        int numVoti = scanner.nextInt();
        for (int i = 0; i < numVoti; i++) {
            System.out.print("inserire il voto " + (i + 1) + ": ");
            s.setMediaVoti(scanner.nextDouble());
        }
        s.stampaDettagli();
        scanner.close();
    }
}