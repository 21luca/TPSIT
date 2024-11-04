import java.util.Scanner;

public class stringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inserisci una stringa: ");
        String s = sc.nextLine();

        System.out.println("lunghezza: " + s.length());
        System.out.println("carattere al centro: " + s. charAt(s. length() / 2));
        System.out.println("iniziale maiuscola: " + s. substring(0, 1).toUpperCase() + s.substring(1));
        System.out.println("occorrenze di 'a': " + s.chars().filter(c -> c == 'a'). count ());
        System.out.println("sottostringa (i primi 4 caratteri): " + (s.length() >= 4 ? s.substring(0, 4) : s));
        System.out.println("carattere maiuscolo: " + s.toUpperCase());
        System.out.println("carattere minuscolo: " + s.toLowerCase());

        sc. close();
    }
}